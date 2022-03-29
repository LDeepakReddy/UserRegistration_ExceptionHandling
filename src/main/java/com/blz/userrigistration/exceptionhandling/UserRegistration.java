package com.blz.userrigistration.exceptionhandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateFirstName(String userFirstName) throws UserRegistrationException {
        boolean result = false;
        try {
            if ((userFirstName == null) || (userFirstName.isEmpty())) {
                throw new UserRegistrationException("Enter valid input", UserRegistrationException.ExceptionType.NULL);

            } else {
                String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
                Pattern pattern = Pattern.compile(firstNameRegex);
                Matcher matcher = pattern.matcher(userFirstName);
                if (matcher.matches())
                    return true;
                throw new UserRegistrationException("Entered first name is invalid", UserRegistrationException.ExceptionType.INVALID_FIRSTNAME);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.exceptionType);
            System.out.println(e.message);
            throw new UserRegistrationException("Enter the valid first name", UserRegistrationException.ExceptionType.INVALID_FIRSTNAME);
        }

    }

    public boolean validateLastName(String userlastName) throws UserRegistrationException {
        boolean result = false;
        try {
            if ((userlastName == null) || (userlastName.isEmpty())) {
                throw new UserRegistrationException("Enter valid input", UserRegistrationException.ExceptionType.NULL);
            } else {
                String lastNameRegex = "^[A-Z]{1}[a-z]{3,}$";
                Pattern pattern = Pattern.compile(lastNameRegex);
                Matcher matcher = pattern.matcher(userlastName);
                if (matcher.matches())
                    return true;
                throw new UserRegistrationException("Enter the Valid Last name ", UserRegistrationException.ExceptionType.INVALID_LASTNAME);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.exceptionType);
            System.out.println(e.message);
            throw new UserRegistrationException("Enter the valid last name ", UserRegistrationException.ExceptionType.INVALID_LASTNAME);
        }


    }

    public boolean validateEmail(String userEmail) throws UserRegistrationException {
        boolean result = false;
        try {
            if ((userEmail == null) || (userEmail.isEmpty())) {
                throw new UserRegistrationException("Enter valid input", UserRegistrationException.ExceptionType.NULL);
            } else {
                String emailRegex = "^[a-z]{3,}(.[a-z]{3,})*@[a-z]{2,}.[a-z]{2,3}([.+_-][a-z]{2})*$";
                Pattern pattern = Pattern.compile(emailRegex);
                Matcher matcher = pattern.matcher(userEmail);
                if (matcher.matches())
                    return true;
                throw new UserRegistrationException("Enter valid Email address", UserRegistrationException.ExceptionType.INVALID_EMAIL);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.exceptionType);
            System.out.println(e.message);
            throw new UserRegistrationException("Enter the valid Email", UserRegistrationException.ExceptionType.INVALID_EMAIL);
        }
    }


    public boolean validateMobilenumber(String userMobile) throws UserRegistrationException {
        boolean result = false;
        try {
            if ((userMobile == null) || (userMobile.isEmpty())) {
                throw new UserRegistrationException("Enter valid input", UserRegistrationException.ExceptionType.NULL);
            } else {
                String mobileNumRegex = "^[0-9]{2}\s?[0-9]{10}$";
                Pattern pattern = Pattern.compile(mobileNumRegex);
                Matcher matcher = pattern.matcher(mobileNumRegex);
                if (matcher.matches())
                    return true;
                throw new UserRegistrationException("Enter valid mobile number", UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.exceptionType);
            System.out.println(e.message);
            throw new UserRegistrationException("Enter the valid Email", UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER);
        }
    }


    public boolean validatePassword(String userPassword) throws UserRegistrationException {
        boolean result = false;
        try {
            if ((userPassword == null) || (userPassword.isEmpty())) {
                throw new UserRegistrationException("Enter valid input", UserRegistrationException.ExceptionType.NULL);
            } else {
                String passwordRegex = "(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*";
                Pattern pattern = Pattern.compile(passwordRegex);
                Matcher matcher = pattern.matcher(passwordRegex);
                if (matcher.matches())
                    return true;
                throw new UserRegistrationException("Enter valid passwod", UserRegistrationException.ExceptionType.INVALID_PASSWORD);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.exceptionType);
            System.out.println(e.message);
            throw new UserRegistrationException("Enter the valid password", UserRegistrationException.ExceptionType.INVALID_PASSWORD);
        }
    }
}







