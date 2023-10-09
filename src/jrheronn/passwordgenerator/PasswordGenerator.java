package jrheronn.passwordgenerator;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordGenerator {

    // Declare the final characters that will be used when generate a password.
    public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBER = "0123456789";
    public static final String SPECIAL = "!@#$%^&*()-_=+[]{};:',.<>/?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the password length: ");
        int length = scanner.nextInt();

        String password = generatePassword(length);
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    private static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        SecureRandom random = random = new SecureRandom();

        // Use at least one character from each set.
        password.append(UPPER.charAt(random.nextInt(UPPER.length())));
        password.append(LOWER.charAt(random.nextInt(LOWER.length())));
        password.append(NUMBER.charAt(random.nextInt(NUMBER.length())));
        password.append(SPECIAL.charAt(random.nextInt(SPECIAL.length())));

        // Generate remaining characters for the password.
        String allCharacters = UPPER + LOWER + NUMBER + SPECIAL;
        for (int i = 4; i < length; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Shuffle the characters of the password.
        String shuffledPassword = shuffleString(password.toString());

        return shuffledPassword;
    }




}
