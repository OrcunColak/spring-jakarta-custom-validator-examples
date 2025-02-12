package com.colak.phonevalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhoneNumberValidatorTest {

    @Test
    void testValidPhoneNumber() {
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        assertTrue(phoneNumberValidator.isValid("+1234567890", null));
    }

    @Test
    void testValidPhoneNumberWithoutPlus() {
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        assertTrue(phoneNumberValidator.isValid("1234567890", null));
    }

    @Test
    void testInvalidShortPhoneNumber() {
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        assertFalse(phoneNumberValidator.isValid("12345", null));
    }

    @Test
    void testInvalidCharactersInPhoneNumber() {
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        assertFalse(phoneNumberValidator.isValid("+12-3456-7890", null));
    }

    @Test
    void testNullPhoneNumber() {
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        assertFalse(phoneNumberValidator.isValid(null, null));
    }

    @Test
    void testEmptyPhoneNumber() {
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        assertFalse(phoneNumberValidator.isValid("", null));
    }

}