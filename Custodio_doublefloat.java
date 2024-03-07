import java.util.Scanner;

public class Custodio_doublefloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doubleValue;
        int maxAttempts = 3;  // Maximum number of attempts

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Hi! Quick question: how many slices of pizza brought joy to your taste buds this year? (Attempt " + attempt + ")");

            if (scanner.hasNextDouble()) {
                doubleValue = scanner.nextDouble();
                System.out.println("Haha, " + doubleValue + " slices – living the pizza dream!");
                break;  // Exit the loop when valid input is received
            } else {
                System.out.println("Oops! That doesn't seem like a valid number. Try again.");
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
