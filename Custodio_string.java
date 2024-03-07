import java.util.Scanner;

public class Custodio_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringValue;
        int maxAttempts = 3;  // Maximum number of attempts

        System.out.println("Welcome to the Year-End Reflections!");
        System.out.println("Let's make it fun. Describe your year in one funny sentence. What's your masterpiece?");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Attempt " + attempt + ":");

            if (scanner.hasNextLine()) {
                stringValue = scanner.nextLine();

                if (!stringValue.trim().isEmpty()) {
                    System.out.println("Nice! '" + stringValue + "' is pure!");
                    break;  // Exit the loop when valid input is received
                } else {
                    System.out.println("Oops! It seems you didn't enter anything. Try again with something amusing!");
                }
            } else {
                System.out.println("Hmm, that doesn't seem like a valid input. Try again with just one sentence.");
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
