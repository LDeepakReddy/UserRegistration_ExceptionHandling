package com.blz.userrigistration.exceptionhandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    IUserRegistration validateFirstName = firstName -> {
        if (firstName == null) {
            throw new UserRegistrationException(" Input can't be Null ", UserRegistrationException.ExceptionType.NULL);
        } else if (firstName.length() == 0) {
            throw new UserRegistrationException("Invalid Input", UserRegistrationException.ExceptionType.EMPTY);
        }
        {
            String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(firstNameRegex);
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
        }
    };

    IUserRegistration validateLastName = lastName -> {
        if (lastName == null) {
            throw new UserRegistrationException(" Input can't be Null", UserRegistrationException.ExceptionType.NULL);
        } else if (lastName.length() == 0) {
            throw new UserRegistrationException("Invalid Input", UserRegistrationException.ExceptionType.EMPTY);
        }
        String regex = "^[A-Z]{1}[a-z]{3,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    };

    IUserRegistration validateEmail = email -> {
        if (email == null) {
            throw new UserRegistrationException(" Input can't be Null", UserRegistrationException.ExceptionType.NULL);
        } else if (email.length() == 0) {
            throw new UserRegistrationException("Invalid Input", UserRegistrationException.ExceptionType.EMPTY);
        }
        String regex = "^[a-z]{3,}(.[a-z]{3,})*@[a-z]{2,}.[a-z]{2,3}([.+_-][a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    };
    IUserRegistration validatePhoneNumber = phoneNumber -> {
        if (phoneNumber == null) {
            throw new UserRegistrationException(" Input can't be Null", UserRegistrationException.ExceptionType.NULL);
        } else if (phoneNumber.length() == 0) {
            throw new UserRegistrationException("Invalid Input", UserRegistrationException.ExceptionType.EMPTY);
        }
        String phoneNumRegex = "^[0-9]{2}\s?[0-9]{10}$";
        Pattern pattern = Pattern.compile(phoneNumRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    };


    IUserRegistration validatePassword = password -> {
        if (password == null) {
            throw new UserRegistrationException(" Input can't be Null", UserRegistrationException.ExceptionType.NULL);
        } else if (password.length() == 0) {
            throw new UserRegistrationException("Invalid Input", UserRegistrationException.ExceptionType.EMPTY);
        }
        String passWordRegex = "(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*";
        Pattern pattern = Pattern.compile(passWordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    };

    IUserRegistration validateEmailId = emailId -> {
        if (emailId == null) {
            throw new UserRegistrationException(" Input can't be Null", UserRegistrationException.ExceptionType.NULL);
        } else if (emailId.length() == 0) {
            throw new UserRegistrationException("Invalid Input", UserRegistrationException.ExceptionType.EMPTY);
        }
        String emialRegex = "^[a-zA-Z0-9]{1,}[.+-]?[a-zA-Z0-9]{1,}?[@][a-zA-Z0-9]{1,}([.][a-zA-Z]{2,}){1,}$";
        Pattern pattern = Pattern.compile(emialRegex);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    };
}