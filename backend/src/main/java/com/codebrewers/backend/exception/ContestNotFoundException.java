package com.codebrewers.backend.exception;

public class ContestNotFoundException extends RuntimeException {
    public ContestNotFoundException(String message) {
        super(message);
    }
}
