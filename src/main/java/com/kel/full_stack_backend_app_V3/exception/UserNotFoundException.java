package com.kel.full_stack_backend_app_V3.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("User could not be found with id: " + id);
    }
}
