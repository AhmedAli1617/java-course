public class FibonacciWithRecursion {
    static int fibonacci(int n) {
        // Base case: the first Fibonacci number is 0, the second is 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Recursive case: sum of the two previous numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int num = 6;  // Change this number for different Fibonacci results
        System.out.println("Fibonacci of " + num + " is: " + fibonacci(num));  // Output: 8
    }
}
