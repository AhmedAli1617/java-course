import java.util.Scanner;

class Stack
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

        }


    }