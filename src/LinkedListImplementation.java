import java.util.ArrayList;

// 14th Oct, 2024
public class LinkedListImplementation {

    class Node{
        int data;
        Node nextNode;
        Node previousNode;

        Node(){

        }
        Node(int data){
            this.data=data;
        }
        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }

    //arrays
    public void main(String[] args) {

       // int[] list = {2, 8, 12, 18, 24, 28, 34, 38, 42, 47, 51, 56, 64, 69, 73};   array of integers

        ArrayList<Integer> arrayList = new ArrayList();




        // Arrays
        // Linked List

        //Linked List, Doubly linkedList, Circular LinkedList
        //nextNode will always be null in the last node
        //no node will have the address of the first node


        //In circular linkedList -> last node has the address of the first node
        //In doubly linkedList -> Nodes have the addresses of the previous and next nodes both rather than having
        // the address of only the next node

        Node node1 = new Node(1);
        Node node2= new Node(3);

        node1.setNextNode(node2);

        // node1 -> node 2
        // node1-> node 3 ->node 2

        Node node3 = new Node(2);
        node1.setNextNode(node3);
        node3.setNextNode(node2);



        //Add a node named as node 3 in between node 1 and node 2

       // Stack
        // HashMaps
    }
}
