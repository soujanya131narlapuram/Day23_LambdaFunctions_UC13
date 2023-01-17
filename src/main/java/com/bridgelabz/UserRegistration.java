package com.bridgelabz;

import java.util.function.Predicate;

public class UserRegistration {
    public static void main(String[] args) {
        // Lambda functions for validating user input
        Predicate<String> validFirstName = name -> name.matches("[A-Z][a-zA-Z]{2,}");
        Predicate<String> validLastName = name -> name.matches("[A-Z][a-zA-Z]{2,}");
        Predicate<String> validEmail = email -> email.matches("\\w+@(\\w+\\.){2,3}(\\w+){1,2}");
        Predicate<String> validMobile = mobile -> mobile.matches("^[+][0-9]{1,3}\\s[0-9]{10}$");
        Predicate<String> validPassword = password -> password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%\\^&\\*])(?=.{8,})");

        // Example user input
        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@gmail.com";
        String mobile = "+91 9876543210";
        String password = "P@ssword1";

        // Validate user input using lambda functions
        if (validFirstName.test(firstName) && validLastName.test(lastName) && validEmail.test(email) && validMobile.test(mobile) && validPassword.test(password)) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed. Please check the errors and try again.");
        }
    }
}

