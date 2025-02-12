package com.colak.ipvalidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.validator.routines.InetAddressValidator;

public class IPAddressValidator implements ConstraintValidator<ValidIPAddress, String> {

    public static final InetAddressValidator VALIDATOR = InetAddressValidator.getInstance();

    @Override
    public boolean isValid(String ipAddress, ConstraintValidatorContext constraintValidatorContext) {
        if (ipAddress == null) {
            return false;
        }
        // return VALIDATOR.isValidInet4Address(ipAddress);
        return VALIDATOR.isValid(ipAddress);
    }
}

