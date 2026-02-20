package com.ecobazaarx.config;

import com.ecobazaarx.jwt.JwtFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Autowired
    private JwtFilter jwtFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                 .requestMatchers("/api/auth/register", "/api/auth/login", "/api/auth/logout").permitAll()
                 .requestMatchers("/api/admin/**").permitAll()
                 .requestMatchers("/api/analyst/**").permitAll()
                 .requestMatchers("/api/user/**").permitAll()
                 .anyRequest().authenticated()
            )
            .addFilterBefore(jwtFilter,
                org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}