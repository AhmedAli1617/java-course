import java.util.ArrayDeque;
import java.util.Deque;

public class MonotonicIncreasingStack {
        // Function to implement monotonic increasing stack
        public static int[] monotonicIncreasing(int[] nums) {
            Deque<Integer> stack = new ArrayDeque<>();

            // Traverse the array
            for (int num : nums) {
                // While stack is not empty AND top of stack is more than the current element
                while (!stack.isEmpty() && stack.peekLast() > num) {
                    // Pop the top element from the stack
                    stack.pollLast();
                }
                // Push the current element into the stack
                stack.offerLast(num);
            }
            //int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};

            //1st iteration 3    Stack  3
            //2nd iteration 1    Stack  empty -> 1
            //3rd iteration 4    Stack 1,4
            //4th iteration 1    Stack empty -> 1
            //5th iteration 5    Stack 1,5
            //6th iteration 9    Stack 1,5,9


            //7th iteration 2    Stack 1,1,2
            //8th iteration 6    Stack 1,1,2,6

            //6,2,1,1

            // Construct the result array from the stack
            int[] result = new int[stack.size()];
            int index = stack.size() - 1;
            while (!stack.isEmpty()) {
                result[index--] = stack.pollLast();
            }

            return result;
        }

        // Main method for example usage
        public static void main(String[] args) {
            // Example usage:
            int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
            int[] result = monotonicIncreasing(nums);
            System.out.print("Monotonic increasing stack: [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i != result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }