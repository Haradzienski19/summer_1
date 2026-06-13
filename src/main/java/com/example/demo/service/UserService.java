package com.example.demo.service;

import com.example.demo.dto.UserRequestDTO;
import com.example.demo.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO userRequestDTO);
    List<UserResponseDTO> getAllUsers();
    UserResponseDTO getUserById(Long id);
    UserResponseDTO updateUser(Long id, UserRequestDTO userRequestDTO);
    void deleteUser(Long id);
}