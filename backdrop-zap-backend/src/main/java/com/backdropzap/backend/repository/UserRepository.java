package com.backdropzap.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backdropzap.backend.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
    boolean existsByClerkId(String clerkId);
    
    Optional<UserEntity> findByClerkId(String clerkId);
}
