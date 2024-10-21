import java.util.Scanner;

public class HollowSquare {

   /* ******
    *    *
    *    *
    ****** */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the side length of the square
        System.out.print("Enter the side length (n): ");
        int n = scanner.nextInt();

        //length 4

        // Loop through each row
        for (int i = 1; i <= n; i++) { // will run 4 times if the length 4    //runs n times
            // Loop through each column
            for (int j = 1; j <= n; j++) {  //will run 4 times if the length 4       //runs n times for all n's
                // Print '*' for the border (first/last row or first/last column)
                // i==1 means first row
                // i==n means last row
                // j==1 means first complete column
                // j==n means last complete column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");  // Print spaces for the hollow part
                }

                //1st row       ****
                //2nd row       *  *
                //3rd row       *  *
                //4th row       ****

            }
            System.out.println();  // Move to the next line after each row
        }


       // Time complexity O(n2)
        scanner.close();
    }
}