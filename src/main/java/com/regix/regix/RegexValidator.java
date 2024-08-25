package com.regix.regix;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexValidator {

    public static void main(String[] args) {
        // Regular expression patterns for validation
        String emailPattern = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,6}$";
        String phonePattern = "^\\+?\\d{10,13}$";
        String zipCodePattern = "^\\d{5}(-\\d{4})?$"; // Supports 5 or 9 digit postal code format

        // Sample strings for validation
        String email = "validate.user@test.com";
        String phone = "+12345678901";
        String zipCode = "12345-6789";

        // Validate email
        System.out.println("Is valid email: " + validate(email, emailPattern));

        // Validate phone number
        System.out.println("Is valid phone number: " + validate(phone, phonePattern));

        // Validate zip code
        System.out.println("Is valid zip code: " + validate(zipCode, zipCodePattern));
    }

    public static boolean validate(String input, String pattern) {
        Pattern p = Pattern.compile(pattern); // Compile the regular expression pattern
        Matcher m = p.matcher(input);         // Match the input string against the pattern
        return m.matches();                   // Return true if the input matches the pattern
    }
}
