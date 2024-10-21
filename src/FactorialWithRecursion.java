public class FactorialWithRecursion {
    // Recursive method to calculate factorial
    static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);

        //120
        //n-5 factorial(4) ->24
        //n-4 factorial(3)->6
        //n-3 factorial(2)-> 2
        //n-2 factorial(1)->1

        //n-2, 2*1;
        //n-3,
    }

    public static void main(String[] args) {
        int num = 5;
        //5*4*3*2*1;
        System.out.println("Factorial of " + num + " is: " + factorial(num));  // Output: 120
    }
}
