package com.siddhant.blog.rest.api.service;

import com.siddhant.blog.rest.api.payload.LoginDto;
import com.siddhant.blog.rest.api.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);

}