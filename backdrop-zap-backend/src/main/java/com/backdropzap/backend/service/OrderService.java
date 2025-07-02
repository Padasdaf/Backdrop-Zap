package com.backdropzap.backend.service;

import com.razorpay.Order;
import com.razorpay.RazorpayException;

public interface OrderService {

    Order createOder(String planId, String clerkId) throws RazorpayException;
}
