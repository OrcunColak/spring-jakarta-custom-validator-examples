package com.colak.phonevalidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, String> {

    // ^ → Start of the string.
    // \\+? → An optional + sign at the beginning.
    // [0-9]{7,15} → Between 7 and 15 digits.
    // $ → End of the string.
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\+?[0-9]{7,15}$");

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        if (phoneNumber == null) {
            return false;
        }

        return PHONE_PATTERN.matcher(phoneNumber).matches();
    }
}
