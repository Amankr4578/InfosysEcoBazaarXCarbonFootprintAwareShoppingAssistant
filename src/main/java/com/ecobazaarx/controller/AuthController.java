package com.ecobazaarx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.ecobazaarx.model.User;
import com.ecobazaarx.repository.UserRepository;
import com.ecobazaarx.jwt.JwtUtil;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public String register(@RequestBody User user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("USER");

        userRepository.save(user);

        return "User registered successfully";
    }

    @PostMapping("/login")
public String login(@RequestBody User user) {

    Optional<User> existingUser = userRepository.findByEmail(user.getEmail());

    if(existingUser.isPresent()) {

        User dbUser = existingUser.get();

        if(passwordEncoder.matches(user.getPassword(), dbUser.getPassword())) {

            return jwtUtil.generateToken(
                    dbUser.getEmail(),
                    dbUser.getRole()
            );
        }
    }

    return "Invalid email or password";
}
@PostMapping("/logout")
public String logout() {
    return "Logout successful (client should delete token)";
}
}