class ListNodeMid {
    int val;
    ListNodeMid next;

    // Constructor
    ListNodeMid(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListMiddle {

    // Function to find the middle of the linked list
    public ListNodeMid findMiddle(ListNodeMid head) {
        if (head == null) {
            return null;  // If the list is empty, return null
        }

        ListNodeMid slow = head;  // Slow pointer
        ListNodeMid fast = head;  // Fast pointer

        //sp -> 1
        //fp -> 1

        //1,2,3,4,5

        //2,5,6,9,1,8




        // Move fast pointer two steps and slow pointer one step at a time
        while (fast != null && fast.next != null) {
            // move slow pointer once
            // move the faster pointer twice
            slow = slow.next;       // Move slow pointer by 1 step
            fast = fast.next.next;  // Move fast pointer by 2 steps
        }
        //1,2,3,4,5

        // 1st iteration sp 1,fp 1  -> sp 2,fp,3
        // 2nd iteration sp 2,fp 3  -> sp 3,fp 5
        // 3rd iteration none

        //2,5,6,9,1,8

        // 1st iteration sp 2, fp 2 -> sp 5,fp 6
        // 2nd iteration sp 5, fp 6 -> sp 6,fp 1
        // 3rd iteration sp 6, fp 1 -> sp 9, fp null


        // When the fast pointer reaches the end, slow will be at the middle
        return slow;
    }

    // Utility function to print a linked list
    public void printList(ListNodeMid head) {
        ListNodeMid current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }


    // iterated linkedList
    // counted all the iterations
    // then we again iterated the linkedlist till all the iterations/2
    // found the middle of the linkedlist


    public static void main(String[] args) {
        // Create a simple linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNodeMid head = new ListNodeMid(1);
        head.next = new ListNodeMid(2);
        head.next.next = new ListNodeMid(3);
        head.next.next.next = new ListNodeMid(4);
        head.next.next.next.next = new ListNodeMid(5);

        LinkedListMiddle list = new LinkedListMiddle();
        
        System.out.println("Original List:");
        list.printList(head);

        // Find the middle of the linked list
        ListNodeMid middle = list.findMiddle(head);

        if (middle != null) {
            System.out.println("Middle of the list is: " + middle.val);
        } else {
            System.out.println("The list is empty.");
        }
    }
}