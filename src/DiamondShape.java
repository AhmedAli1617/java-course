import java.util.Scanner;

public class DiamondShape {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the top half of the diamond
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        // Top half (including the middle row)
        for (int i = 1; i <= n + 1; i++) {
            // Print leading spaces
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            //no of stars equal to no of row*2 -1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line
        }

        // Bottom half (excluding the middle row)
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            //spaces are no of rows+1-row iteration
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line
        }

        scanner.close();
    }
}