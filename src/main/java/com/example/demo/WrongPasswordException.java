package com.example.demo;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {

        super(message);
    }
}
