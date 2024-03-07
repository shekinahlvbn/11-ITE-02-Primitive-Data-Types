import java.util.Scanner;

public class Custodio_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charValue;
        int maxAttempts = 3;  // Maximum number of attempts

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Hello! Imagine you're a character in a book. What's the first letter of your character's name? (Attempt " + attempt + ")");
            
            if (scanner.hasNext()) {
                String input = scanner.next();
                
                if (input.length() == 1) {
                    charValue = input.charAt(0);
                    System.out.println("Fantastic! '" + charValue + "' captures your essence!");
                    break;  // Exit the loop when valid input is received
                } else {
                    System.out.println("Oops! It looks like you entered more than one character. Please provide a single letter.");
                }
            } else {
                System.out.println("Hmm, that doesn't seem like a valid input. Try again with just one character.");
                scanner.nextLine();  // Consume the invalid input to avoid an infinite loop
            }

            if (attempt == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. Exiting the program.");
            }
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
