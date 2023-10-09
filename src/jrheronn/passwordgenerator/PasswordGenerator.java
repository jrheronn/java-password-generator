package jrheronn.passwordgenerator;

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
    }


}
