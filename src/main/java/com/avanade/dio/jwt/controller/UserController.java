package com.avanade.dio.jwt.controller;

import com.avanade.dio.jwt.data.UserData;
import com.avanade.dio.jwt.service.UserDetailsServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserDetailsServiceImpl userDetailsService;

    public UserController(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @GetMapping("/all-users")
    public List<UserData> listAllUsers() {
        return userDetailsService.listUsers();
    }
}
