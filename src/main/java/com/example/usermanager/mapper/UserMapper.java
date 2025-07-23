package com.example.usermanager.mapper;

import com.example.usermanager.dto.UserDTO;
import com.example.usermanager.model.User;

public class UserMapper {

    public static UserDTO convertToDTO(User user) {
        return new UserDTO(user.getId(), user.getName(), user.getEmail());
    }

    public static User convertToEntity(UserDTO dto) {
        return new User(dto.getId(), dto.getName(), dto.getEmail());
    }
}
