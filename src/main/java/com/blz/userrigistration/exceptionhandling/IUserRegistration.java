package com.blz.userrigistration.exceptionhandling;

@FunctionalInterface
interface IUserRegistration {
    boolean validate(String data) throws UserRegistrationException;
}
