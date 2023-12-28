package com.feem.reiss.service.impl;

import com.feem.reiss.dao.UserDao;
import com.feem.reiss.jwt.JwtService;
import com.feem.reiss.model.AuthResponse;
import com.feem.reiss.model.LoginRequest;
import com.feem.reiss.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public AuthResponse login(LoginRequest request) {
        // Use password Bcrypt -- only coment for this example
        // authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user = userDao.findByUsername(request.getUsername()).orElseThrow();
        String token = jwtService.getToken(user);
        AuthResponse authResponse = new AuthResponse();
        authResponse.setToken(token);
        return authResponse;
    }
}
