public class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;

        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;

                //last node will be the one which has the next node == null
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    public static LinkedList deleteByKey(LinkedList list,
                                         int key)
    {
        // Store head node
        Node currNode = list.head, prev = null;

        //
        // CASE 1:
        // If head node itself holds the key to be deleted



        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(key + " found and deleted");

            // Return the updated List
            return list;
        }

        //
        // CASE 2:
        // If the key is somewhere other than at head
        //

        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null && currNode.data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        //2,9,8,4,7
         //2,9
         //,9,8
          // 8,4
        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;

            //prev had 4 in it's next point, 8

            // Display the message
            System.out.println(key + " found and deleted");
        }

        //
        // CASE 3: The key is not present
        //

        // If key was not present in linked list
        // currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }

        // return the List
        return list;
    }




    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {

        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        deleteByKey(list, 3);

       Node middleNode=  getMiddleOfLinkedList(list.head);
       System.out.println("Middle node's data: "+middleNode.data);

        // node1->5 ,node 2 -> 9, node3 ->3, node4 ->6
        // I want to search 5 which is head node. Just set the head node's next to null. Set the head == next node;
        // fetch the start node
        // starts iterating the nodes till it finds a node that has the value 3 saved inside it
        // node3->node4 , set node3.nextNode =null; set node2.nextNode=node4

        // Print the LinkedList


    }

    private static Node getMiddleOfLinkedList(Node head) {

        if(head==null){
            //linkedList has 0
            System.out.print("This linkedList is empty");
            return null;
        }else if(head.next==null) {
            //linkedList has only 1 member which is the head node.
            System.out.print("This linkedList has only one member");
            return head;
        } else  {
           Integer length = getLengthOfLinkedList(head);

          // 2,3,4,5,6,18,7;

           //7 is the length of the linkedList

           Integer midIndex= length/2;

           //midindex has value 3

            int counter=0;
           while (counter<midIndex-1){
               head=head.next;
               counter++;
           }

           //midIndex =3
           //1st iteration counter -> 0  changed to 1, head -> 2nd element
            // 2nd iteration counter -> 1 changed to 2, head ->3rd element
            // 3rd iteration check fails

            return head;

        }

    }

    // used for re-usability
    private static Integer getLengthOfLinkedList(Node head) {
        int length = 0;

        while (head!=null){
            length++;
            head=head.next;
        }
        return length;

    }
}
