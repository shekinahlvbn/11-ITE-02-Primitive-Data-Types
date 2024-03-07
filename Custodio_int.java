import java.util.Scanner;

public class Custodio_int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValue;
        int maxAttempts = 3;  // Maximum number of attempts

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Hey there! Curious, how many books made it to your reading list this year? (Attempt " + attempt + ")");

            if (scanner.hasNextInt()) {
                intValue = scanner.nextInt();
                System.out.println("Nice! " + intValue + " books – you're definitely a booknerd!");
                break;  // Exit the loop when valid input is received
            } else {
                System.out.println("Hmm, looks like that's an invalid number. Mind giving it another go?");
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
