package com.bridgelabz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.function.Predicate;
public class UserRegistrationTest {
    @Test
    public void testValidFirstName() {
        Predicate<String> validFirstName = name -> name.matches("[A-Z][a-zA-Z]{2,}");
        assertTrue(validFirstName.test("John"));
        assertTrue(validFirstName.test("Jane"));
        assertFalse(validFirstName.test("jane"));
        assertFalse(validFirstName.test("J"));
    }

    @Test
    public void testValidLastName() {
        Predicate<String> validLastName = name -> name.matches("[A-Z][a-zA-Z]{2,}");
        assertTrue(validLastName.test("Doe"));
        assertTrue(validLastName.test("Smith"));
        assertFalse(validLastName.test("smith"));
        assertFalse(validLastName.test("S"));
    }


    @Test
    public void testValidMobile() {
        Predicate<String> validMobile = mobile -> mobile.matches("^[+][0-9]{1,3}\\s[0-9]{10}$");
        assertTrue(validMobile.test("+91 9876543210"));
        assertTrue(validMobile.test("+1 9876543210"));
        assertFalse(validMobile.test("+91"));
        assertFalse(validMobile.test("9876543210"));
    }

    @Test
    public void testValidEmail() {
        Predicate<String> validEmail = email -> email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
        assertTrue(validEmail.test("john.doe@gmail.com"));
        assertTrue(validEmail.test("jane.smith@yahoo.in"));
        assertFalse(validEmail.test("john.doe@"));
        assertFalse(validEmail.test("john.doe@.com"));
    }

    @Test
    public void testValidPassword() {
        Predicate<String> validPassword = password -> password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%\\^&\\*])(?=.{8,})");
        assertTrue(validPassword.test("P@ssword1"));
        assertTrue(validPassword.test("P@ssword2#"));
        assertFalse(validPassword.test("password1"));
        assertFalse(validPassword.test("p@ssword1"));
    }

}

