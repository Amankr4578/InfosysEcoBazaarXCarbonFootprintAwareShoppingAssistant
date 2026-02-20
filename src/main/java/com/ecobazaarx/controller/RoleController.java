package com.ecobazaarx.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class RoleController {

    @GetMapping("/admin/dashboard")
    public String adminAccess() {
        return "Admin Dashboard Access Granted";
    }

    @GetMapping("/analyst/dashboard")
    public String analystAccess() {
        return "Analyst Dashboard Access Granted";
    }

    @GetMapping("/user/dashboard")
    public String userAccess() {
        return "User Dashboard Access Granted";
    }
}