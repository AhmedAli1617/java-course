/*
package com.starzplay.etisalatbundle.eg.provisioning.controller;

import java.util.ArrayDeque;
import java.util.Deque;

public class FourthSession {

   */
/* class Stack
    {
        int[] a;
        int top;
        Stack()
        {
            a=new int[100];
            top=-1;
        }

        void push(int x)
        {
            if(top==a.length-1)
                System.out.println("overflow");
            else
                a[++top]=x;
        }

        int pop()
        {
            if(top==-1)
            {System.out.println("underflow");
                return -1;
            }
            else
                return(a[top--]);
        }

        void display()
        {
            for(int i=0;i<=top;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }

        boolean isEmpty()
        {
            if(top==-1)
                return true;
            else
                return false;
        }

        int peek()
        {
            if(top==-1)
                return -1;
            return (a[top]);
        }


    }*//*

 */
/*
    public static class MonotonicIncreasingStack {
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
    }*//*

 */
/*
    public static void main(String args[])
    {

        Stack s=new Stack();
        Scanner in= new Scanner(System.in);

        // 1,3,5,4

        //LIFO Last in first out mechanism



        //  4
        //  5
        //  3
        //  1


        //{   -> pop this when "}" received
        //{   -> pop this too

        // if you are left with an empty stack it means that your parenthesis are balanced.


        //Started from my home -> grocery store

        // Push all your turns as you move towards the grocery store
        // Pop them on your way backwards



        //right turn
        //left turn
        //left turn
        // right turn


        //Normal Stack
        //2
        //3
        //1

        //Monotonic Stack
        //4
        //2
        //1


        //1
        //2
        //3



        //Monotonic Stacks are of two types: Increasing Monotonic Stack , Decreasing Monotonic Stack

        do
        {System.out.println("n******** MENU *******");
            System.out.println("n1.PUSH");
            System.out.println("n2.POP");
            System.out.println("n3.PEEK");
            System.out.println("n4 IS EMPTY");
            System.out.println("n5.EXIT");
            System.out.println("n enter ur choice : ");
            switch(in.nextInt())
            {
                case 1:
                    System.out.println("nenter the value ");
                    s.push(in.nextInt());
                    break;
                case 2:
                    System.out.println("n popped element : "+ s.pop());
                    break;

                case 3:
                    System.out.println("n top element : "+ s.peek());
                    break;
                case 4: System.out.println("n is empty : "+ s.isEmpty());
                    break;
                case 5: System.exit(0);
                    break;
                default: System.out.println("n Wrong Choice!");
                    break;
            }

            System.out.println("n do u want to cont... ");
        }while(in.nextInt()==1);

    }*//*


    //Queues FIFO (First In First Out Technique)


    class Queue {

        private static int front, rear, capacity;
        private static int queue[];

        Queue(int size) {
            front = rear = 0;
            capacity = size;
            queue = new int[capacity];
        }

        // insert an element into the queue
        static void queueEnqueue(int item)  {
            // check if the queue is full
            if (capacity == rear) {
                System.out.printf("\nQueue is full\n");
                return;
            }

            // insert element at the rear
            else {
                queue[rear] = item;
                rear++;
            }
            return;
        }

        //remove an element from the queue
        static void queueDequeue()  {
            // check if queue is empty
            if (front == rear) {
                System.out.printf("\nQueue is empty\n");
                return;
            }

            // shift elements to the right by one place uptil rear
            else {
                for (int i = 0; i < rear - 1; i++) {
                    queue[i] = queue[i + 1];
                    //save the next one in the previous one
                }

                //10,30,50,70

                //1st iteration 30,30,50,70
                //2nd iteration 30,50,50,70
                //3rd iteration 30,50,70,70


                // set queue[rear] to 0
                if (rear < capacity)
                    queue[rear] = 0;

                // 30,50,70,0

                // decrement rear
                rear--;

                //30,50,70
            }
            return;
        }

        // print queue elements
        static void queueDisplay()
        {
            int i;
            if (front == rear) {
                System.out.printf("Queue is Empty\n");
                return;
            }

            // traverse front to rear and print elements
            for (i = front; i < rear; i++) {
                System.out.printf(" %d , ", queue[i]);
            }
            return;
        }

        // print front of queue
        static void queueFront()
        {
            if (front == rear) {
                System.out.printf("Queue is Empty\n");
                return;
            }
            System.out.printf("\nFront Element of the queue: %d", queue[front]);
            return;
        }
    }

    public class QueueArrayImplementation {
        public static void main(String[] args) {
            // Create a queue of capacity 4
            Queue q = new Queue(4);

            System.out.println("Initial Queue:");
            // print Queue elements
            q.queueDisplay();

            // inserting elements in the queue
            q.queueEnqueue(10);
            q.queueEnqueue(30);
            q.queueEnqueue(50);
            q.queueEnqueue(70);

            // print Queue elements
            System.out.println("Queue after Enqueue Operation:");
            q.queueDisplay();

            // print front of the queue
            q.queueFront();

            // insert element in the queue
            q.queueEnqueue(90);

            // print Queue elements
            q.queueDisplay();

            q.queueDequeue();
            q.queueDequeue();
            System.out.printf("\nQueue after two dequeue operations:");

            // print Queue elements
            q.queueDisplay();

            // print front of the queue
            q.queueFront();
        }
    }


*/
/*

    import java.util.Scanner;

    *//*

 */
/** class Task **//*
 */
/*

    class Task
    {
        String job;
        int priority;

        *//*

 */
/** Constructor **//*
 */
/*

        public Task(String job, int priority)
        {
            this.job = job;
            this.priority = priority;
        }
        *//*

 */
/** toString() **//*
 */
/*

        public String toString()
        {
            return "Job Name : "+ job +"\nPriority : "+ priority;
        }
    }

    *//*

 */
/** Class PriorityQueue **//*
 */
/*

    class PriorityQueue
    {
        private Task[] heap;   //array of objects
        private int heapSize, capacity;

        *//*

 */
/** Constructor **//*
 */
/*

        public PriorityQueue(int capacity)
        {
            this.capacity = capacity + 1;
            heap = new Task[this.capacity];
            heapSize = 0;
        }
        *//*

 */
/** function to clear **//*
 */
/*

        public void clear()
        {
            heap = new Task[capacity];
            heapSize = 0;
        }
        *//*

 */
/** function to check if empty **//*
 */
/*

        public boolean isEmpty()
        {
            return heapSize == 0;
        }
        *//*

 */
/** function to check if full **//*
 */
/*

        public boolean isFull()
        {
            return heapSize == capacity - 1;
        }
        *//*

 */
/** function to get Size **//*
 */
/*

        public int size()
        {
            return heapSize;
        }
        *//*

 */
/** function to insert task **//*
 */
/*

        public void insert(String job, int priority)
        {
            Task newJob = new Task(job, priority);

            heap[++heapSize] = newJob;

            //cleaner is saved on the 0th index

            int pos = heapSize;

            // post =1
            // pos =2
            //pos =3
            while (pos != 1 && newJob.priority > heap[pos/2].priority)
            {
                heap[pos] = heap[pos/2];
                pos /=2;
            }

            //job='cleaner',priority=2
            //jon='manager',priority=5
            //job='clerk',priority=1

            //1st element insertion   cleaner,cleaner
            //2nd element insertion   cleaner,manager,manager   pos->1
            //3rd element insertion   cleaner,manager,clerk


            heap[pos] = newJob;
        }
        *//*

 */
/** function to remove task **//*
 */
/*

        public Task remove()
        {
            int parent, child;
            Task item, temp;
            if (isEmpty() )
            {
                System.out.println("Heap is empty");
                return null;
            }

            item = heap[1];
            temp = heap[heapSize--];

            parent = 1;
            child = 2;
            while (child <= heapSize)
            {
                if (child < heapSize && heap[child].priority < heap[child + 1].priority)
                    child++;
                if (temp.priority >= heap[child].priority)
                    break;

                heap[parent] = heap[child];
                parent = child;
                child *= 2;
            }
            heap[parent] = temp;

            return item;
        }
    }

    *//*

 */
/** Class PriorityQueueTest **//*
 */
/*

    public class PriorityQueueTest
    {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Priority Queue Test\n");

            System.out.println("Enter size of priority queue ");
            PriorityQueue pq = new PriorityQueue(scan.nextInt() );

            char ch;
            *//*

 */
/*  Perform Priority Queue operations *//*
 */
/*

            do
            {
                System.out.println("\nPriority Queue Operations\n");
                System.out.println("1. insert");
                System.out.println("2. remove");
                System.out.println("3. check empty");
                System.out.println("4. check full");
                System.out.println("5. clear");
                System.out.println("6. size");

                int choice = scan.nextInt();
                switch (choice)
                {
                    case 1 :
                        System.out.println("Enter job name and priority");
                        pq.insert(scan.next(), scan.nextInt() );
                        break;
                    case 2 :
                        System.out.println("\nJob removed \n\n"+ pq.remove());
                        break;
                    case 3 :
                        System.out.println("\nEmpty Status : "+ pq.isEmpty() );
                        break;
                    case 4 :
                        System.out.println("\nFull Status : "+ pq.isFull() );
                        break;
                    case 5 :
                        System.out.println("\nPriority Queue Cleared");
                        pq.clear();
                        break;
                    case 6 :
                        System.out.println("\nSize = "+ pq.size() );
                        break;
                    default :
                        System.out.println("Wrong Entry \n ");
                        break;
                }

                System.out.println("\nDo you want to continue (Type y or n) \n");
                ch = scan.next().charAt(0);
            } while (ch == 'Y'|| ch == 'y');
        }
    }
*//*


}

*/
