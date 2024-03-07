import java.util.Scanner;

public class Custodio_boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean boolValue;
        int maxAttempts = 3;  // Maximum number of attempts

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Hey! Is your year as wild and unpredictable as a rollercoaster? (true/false) (Attempt " + attempt + ")");

            if (scanner.hasNextBoolean()) {
                boolValue = scanner.nextBoolean();
                System.out.println("Absolutely! This year is indeed a thrilling rollercoaster ride: " + boolValue);
                break;  // Exit the loop when valid input is received
            } else {
                System.out.println("Oops! It seems you didn't enter 'true' or 'false'. Try again, keeping it real!");
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


