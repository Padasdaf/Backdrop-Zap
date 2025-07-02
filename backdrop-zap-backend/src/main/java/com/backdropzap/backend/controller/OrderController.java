package com.backdropzap.backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backdropzap.backend.dto.RazorpayOrderDTO;
import com.backdropzap.backend.response.BackdropZapResponse;
import com.backdropzap.backend.service.OrderService;
import com.backdropzap.backend.service.RazorpayService;
import com.razorpay.Order;
import com.razorpay.RazorpayException;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final RazorpayService razorpayService;

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestParam String planId, Authentication authentication)
                                    throws RazorpayException {
        Map<String, Object> responseMap = new HashMap<>();
        BackdropZapResponse response = null;
        //validation
        if (authentication.getName().isEmpty() || authentication.getName() == null) {
            response = BackdropZapResponse.builder()
                    .statusCode(HttpStatus.FORBIDDEN)
                    .success(false)
                    .data("User does not have permission/access to this resource")
                    .build();
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(response);
        }

        try {
            Order order = orderService.createOder(planId, authentication.getName());
            RazorpayOrderDTO responseDTO = convertToDTO(order);
            response = BackdropZapResponse.builder()
                    .success(true)
                    .data(responseDTO)
                    .statusCode(HttpStatus.CREATED)
                    .build();
            return ResponseEntity.ok(response);
        }catch (Exception e) {
            response = BackdropZapResponse.builder()
                    .statusCode(HttpStatus.INTERNAL_SERVER_ERROR)
                    .data(e.getMessage())
                    .success(false)
                    .build();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    private RazorpayOrderDTO convertToDTO(Order order) {
        return RazorpayOrderDTO.builder()
                .id(order.get("id"))
                .entity(order.get("entity"))
                .amount(order.get("amount"))
                .currency(order.get("currency"))
                .status(order.get("status"))
                .created_at(order.get("created_at"))
                .receipt(order.get("receipt"))
                .build();
    }

    @PostMapping("/verify")
    public ResponseEntity<?> verifyOrder(@RequestBody Map<String, Object> request) throws RazorpayException {
        try {
            String razorpayOrderId = request.get("razorpay_order_id").toString();
            Map<String, Object> returnValue = razorpayService.verifyPayment(razorpayOrderId);
            return ResponseEntity.ok(returnValue);
        }catch (RazorpayException e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("success", false);
            errorResponse.put("message", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }
}
