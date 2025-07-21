package com.example.usermanager;

import com.example.usermanager.dto.UserDTO;

public class Test {
    public static void main(String[] args) {
        UserDTO u = new UserDTO(1L, "Alice", "alice@example.com");
        System.out.println(u.getName()); // Should compile
    }
}
