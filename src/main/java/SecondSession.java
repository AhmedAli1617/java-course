//October 13th, 2024
public class SecondSession {

    public static int BinarySearch ( int[] list, int targetValue){

      //  int[] list = {2, 8, 12, 18, 24, 28, 34, 38, 42, 47, 51, 56, 64, 69, 73};

       // int targetValue = 63;

        int mid, low, high;
        low =0;
        high = list.length - 1;
        while (high >= low) {
            mid = (high+low) /2;
            if (list[mid] < targetValue) {
                low = mid +1;
            } else if (list[mid] > targetValue) {
                high = mid - 1;
            } else {
                return mid;
            }

            //1st iteration
            // low =0, high=14,mid=7  low->8,high -> same, mid->same

            //2nd iteration
            // low=8, high=14, mid=7     mid->11,low=12,high->same

            //3rd iteration
            //low =12, high=14, mid 11     mid->13, low=12,high=12

            //4th iteration
            //low=12, high=12, mid=13    mid ->12 , low->same, high ->11

            //5th iteration
            // low=12, high=11, mid=12



        }


        return -1;

    }
    public static void main(String[] args) {

        //Linear Search Algo
        //array of 5 digits
        // find a digit in the array
        // O(n)


        //Binary Search Algo
        // O(log n)


        int[] list = {2, 8, 12, 18, 24, 28, 34, 38, 42, 47, 51, 56, 64, 69, 73};

        int targetValue = 63;

        System.out.println(BinarySearch(list,targetValue));


    }

    //linear search algorithm

}
