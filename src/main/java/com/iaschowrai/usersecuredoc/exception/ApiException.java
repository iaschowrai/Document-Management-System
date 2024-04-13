package com.iaschowrai.usersecuredoc.exception;

public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
    public ApiException() {
        super("AN error occurred");
    }

}
