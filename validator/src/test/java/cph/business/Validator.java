package cph.business;

public class Validator {
    public boolean validatePassword(String password) {
        int numCount = 0;

        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");

        }

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                numCount++;
                if (numCount >= 2) {
                    return true; // Both conditions are met
                }
            }
        }

        throw new IllegalArgumentException("you need atleast 2 numbers in your password"); // The password doesn't contain at least 2 numbers
    }
}
