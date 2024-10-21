public class SumArrayWithRecursion {
    static int sumArray(int[] arr, int n) {
        // Base case: if there are no elements, sum is 0
        if (n <= 0) {
            return 0;
        }
        // Recursive case: sum of n-1 elements plus the nth element
        return sumArray(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

      /*  int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of array elements: "+sum);
        */

        //int[] arr = {1, 2, 3, 4, 5};

        //1st call sumArray(arr,5)  n-5
        //2nd call summArray(arr,4)  n-5
        //3rd call summArray(arr,3)  n-4
        //4th call summArray(arr,2)  n-3
        //5th call summArray(arr,1)  n-2
        //6th call summArray(arr,0)  n-1
        
        //return sumArray(arr, n - 1) + arr[n - 1];

       // return 0 + arr[1 - 1];  add 0+1=1;
        // return 1+ arr[2-1];  add 1+2=3;
        // return 3+ arr[3-1]; add 3+3=6;
        // return 6+ arr[4-1]; add 6+4=10;
        // return 10+arr[5-1]; add 10+5=15

        
        //6th response summArray(arr,0) ->0
        //5th response summArray(arr,1) ->1
        //5th response summArray(arr,2) ->3
        
        
        System.out.println("Sum of array elements: " + sumArray(arr, arr.length));  // Output: 15


    }
}
