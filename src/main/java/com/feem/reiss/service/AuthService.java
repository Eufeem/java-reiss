package com.feem.reiss.service;

import com.feem.reiss.model.AuthResponse;
import com.feem.reiss.model.LoginRequest;

public interface AuthService {
    AuthResponse login(LoginRequest loginRequest);

}
