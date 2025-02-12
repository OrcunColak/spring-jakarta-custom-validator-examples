package com.colak.ipvalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IPAddressValidatorTest {


    @Test
    void testValidIPv4Address() {
        IPAddressValidator ipAddressValidator = new IPAddressValidator();
        assertTrue(ipAddressValidator.isValid("192.168.1.1", null));
    }

    @Test
    void testValidIPv6Address() {
        IPAddressValidator ipAddressValidator = new IPAddressValidator();
        assertTrue(ipAddressValidator.isValid("2001:db8::ff00:42:8329", null));
    }

    @Test
    void testInvalidIPAddress() {
        IPAddressValidator ipAddressValidator = new IPAddressValidator();
        assertFalse(ipAddressValidator.isValid("999.999.999.999", null));
    }

    @Test
    void testNullIPAddress() {
        IPAddressValidator ipAddressValidator = new IPAddressValidator();
        assertFalse(ipAddressValidator.isValid(null, null));
    }

    @Test
    void testEmptyStringIPAddress() {
        IPAddressValidator ipAddressValidator = new IPAddressValidator();
        assertFalse(ipAddressValidator.isValid("", null));
    }

}