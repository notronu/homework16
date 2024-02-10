package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public interface ParametersService {
    public  void validateParameters(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException;
}
