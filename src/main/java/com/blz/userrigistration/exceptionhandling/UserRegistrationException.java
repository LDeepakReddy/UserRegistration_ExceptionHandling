package com.blz.userrigistration.exceptionhandling;

public class UserRegistrationException extends Exception {
    public String message;
    public ExceptionType exceptionType;

    public enum ExceptionType {
        NULL, EMPTY, INVALID_FIRSTNAME, INVALID_LASTNAME, INVALID_MOBILE_NUMBER, INVALID_EMAIL, INVALID_PASSWORD;
    }

    UserRegistrationException(String message, ExceptionType exceptionType) {
        this.message = message;
        this.exceptionType = exceptionType;
    }


}
