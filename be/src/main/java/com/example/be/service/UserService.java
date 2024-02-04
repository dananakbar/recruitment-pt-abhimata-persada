package com.example.be.service;

import java.util.Optional;

import com.example.be.model.User;

public interface UserService {
  User save(User user);
  Optional<User> findByUsername(String username);
}