package com.colak.ipvalidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.validator.routines.InetAddressValidator;

public class IPAddressValidator implements ConstraintValidator<ValidIPAddress, String> {

    public static final InetAddressValidator VALIDATOR = new InetAddressValidator();

    @Override
    public boolean isValid(String ipAddress, ConstraintValidatorContext constraintValidatorContext) {
        // return VALIDATOR.isValidInet4Address(ipAddress);
        return VALIDATOR.isValid(ipAddress);
    }
}

