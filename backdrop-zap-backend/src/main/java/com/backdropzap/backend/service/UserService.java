package com.backdropzap.backend.service;

import com.backdropzap.backend.dto.UserDTO;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    UserDTO getUserByClerkId(String clerkId);
    void deleteUserByClerkId(String clerkId);
}
