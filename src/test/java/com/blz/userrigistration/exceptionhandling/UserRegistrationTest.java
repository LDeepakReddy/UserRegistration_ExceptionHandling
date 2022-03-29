package com.blz.userrigistration.exceptionhandling;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    public static String expected;
    public static String actual;


    UserRegistration test = new UserRegistration();

    @Test
    public void givenFirstNameWithNoUpperCaseAtTheStart() {
        try {
            boolean firstName = test.validateFirstName("deepak");
            Assert.assertEquals(false, firstName);
        } catch (UserRegistrationException e) {
            UserRegistrationException.ExceptionType expected = UserRegistrationException.ExceptionType.INVALID_FIRSTNAME;
            Assert.assertEquals(expected, e.exceptionType);
            System.out.println(e.exceptionType + " and " + expected);
        }

    }

    @Test
    public void givenFirstNameAsNull() {
        try {
            boolean firstName = test.validateFirstName(null);
            Assert.assertEquals(false, firstName);
        } catch (UserRegistrationException e) {
            UserRegistrationException.ExceptionType expected = UserRegistrationException.ExceptionType.NULL;
            Assert.assertEquals(expected, e.exceptionType);
            System.out.println(e.exceptionType);

        }
    }

    @Test
    public void givenLastNameWithNoUpperCaseAtTheStart() {
        try {
            boolean lastName = test.validateLastName("reddy");
            Assert.assertEquals(false, lastName);

        } catch (UserRegistrationException e) {
            UserRegistrationException.ExceptionType expected = UserRegistrationException.ExceptionType.INVALID_LASTNAME;
            Assert.assertEquals(expected, e.exceptionType);
            System.out.println(e.exceptionType);

        }

    }

    @Test
    public void givenValidEmailWithOutMandatoryPartsAndOptionalParts() {
        try {
            boolean email = test.validateEmail("abc@gmail.com.com");
            Assert.assertEquals(true, email);
        } catch (UserRegistrationException e) {
            UserRegistrationException.ExceptionType expected = UserRegistrationException.ExceptionType.INVALID_EMAIL;
            Assert.assertEquals(expected, e.exceptionType);
            System.out.println(e.exceptionType);

        }
    }

    @Test
    public void givenMobileFormatWithoutCountryCodeSpaceAnd10DigitNumber() {
        try {
            boolean mobNum = test.validateMobilenumber("919182510123");
            Assert.assertEquals(false, mobNum);
        } catch (UserRegistrationException e) {
            UserRegistrationException.ExceptionType expected = UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER;
            Assert.assertEquals(expected, e.exceptionType);
            System.out.println(e.exceptionType);
        }

    }

    @Test
    public void givenPasswordWithOutMinimum1Numeric1UpperCaseLowerCaseAndExact1SpecialCharacterValueAndMinimum8Characters() {
        try {
            boolean password = test.validatePassword("deepak@reddy7");
            Assert.assertEquals(false, password);
        } catch (UserRegistrationException e) {
            UserRegistrationException.ExceptionType expected = UserRegistrationException.ExceptionType.INVALID_PASSWORD;
            Assert.assertEquals(expected, e.exceptionType);
            System.out.println(e.exceptionType);
        }

    }

}