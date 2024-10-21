class ListNode {
    int val;
    ListNodeMid next;

    // Constructor
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListReversal {

    // Function to reverse the linked list
    public ListNodeMid reverseList(ListNodeMid head) {
        ListNodeMid prev = null;    // To keep track of the previous node
        ListNodeMid current = head; // The current node that we are processing

        // Iterate through the linked list
        int count=1;
        while (current != null) {
            System.out.println("Iteration: "+count);
            ListNodeMid next = current.next;  // Temporarily store the next node
            System.out.println("Next: "+ next.val);
            current.next = prev;           // Reverse the current node's pointer
            System.out.println("Current.next : "+current!=null?current.next!=null?next.val:null:null);
            prev = current;                // Move prev to current
            System.out.println("Prev : "+prev.val);
            current = next;                // Move current to next node
            System.out.println("Current : "+current.val);
            System.out.println();
            System.out.println("Linked List condition: " );
            printList(current);
            count++;
        }

        //1,2,3,4,5
        //5,4,3,2,1

        //1st iteration  prev null, curr head -> next 2, curr.next null, prev 1, curr 2

        // 1,null,2,3,4,5

        //2nd iteration  next 2, curr.next null, prev 1, curr 2 -> next 3, curr.next 1, prev 2, curr 3

        // 2,3,1,4,5

        //3rd iteration next 3, curr.next 1, prev 2, curr 3 -> next 4, curr.next 2, prev 3, curr 4

        //   3,4,2







        // At the end, prev will be the new head of the reversed list
        return prev;
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

    public static void main(String[] args) {
        // Create a simple linked list: 1 -> 2 -> 3 -> 4 -> 5


        ListNodeMid head = new ListNodeMid(1);
        head.next = new ListNodeMid(2);
        head.next.next = new ListNodeMid(3);
        head.next.next.next = new ListNodeMid(4);
        head.next.next.next.next = new ListNodeMid(5);

        LinkedListReversal list = new LinkedListReversal();
        
        System.out.println("Original List:");
        list.printList(head);

        // Reverse the linked list
        ListNodeMid reversedHead = list.reverseList(head);

        System.out.println("Reversed List:");
        list.printList(reversedHead);
    }
}