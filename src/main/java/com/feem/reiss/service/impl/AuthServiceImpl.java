package com.feem.reiss.service.impl;

import com.feem.reiss.model.AuthResponse;
import com.feem.reiss.model.LoginRequest;
import com.feem.reiss.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        return null;
    }
}
