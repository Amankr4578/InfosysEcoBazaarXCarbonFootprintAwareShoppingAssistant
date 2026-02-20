package com.ecobazaarx.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/user")
    public String userAccess() {
        return "User access granted";
    }

    @GetMapping("/admin")
    public String adminAccess() {
        return "Admin access granted";
    }

    @GetMapping("/analyst")
    public String analystAccess() {
        return "Analyst access granted";
    }
}