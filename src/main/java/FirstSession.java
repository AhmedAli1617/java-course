public class FirstSession {
    int sum=9;
    char a= 'a';

    String name="Ahmed";

    Integer sum2=0;

    void manipulateSum2(){
        int localVariable=0;
        sum2.toString();
        name.toLowerCase();
        name.startsWith("a");

    }

    public static void main(String[] args) {
       /* FirstSession firstSession = new FirstSession();
        int a=3,b=4;
        String firstName="Ahmed",lastName="Ali";
        int sum = a / b;
        String concatenatedName =firstName+" "+lastName;

        if(a!=b){ //a is not equals to be

        }else{

        }

        if(a > b){
            // if a is greater than
        }

        if(a<b){
            //if a is smaller in value than b
            //this block runs
        }else{

        }*/

       /* int a=18,b=5,c=15,x=13;

        if(b<=c){
            x=3;
        } else if (a<=c){
            x=10;
        }else if (a>=c){
            x=1;
        }else {
            x=19;
        }

        System.out.print(x);
*/

       /* int a=58;


        //initial value; condition till the loop runs;manipulation of the iterator
        for(int i=4;i>0;i--){
            a=a-i;


            //1st iteration   i=4,a=58 -> 54
            //2nd iteration i=3, a=54 -> 51
            //3rd iteration i=2, a=51 -> 49
            //4th iteration i=1, a=49 -> 48

        }
        System.out.print(a);
*/


        /*int n=x.length;

        for(int j=n-1;j>0;j--)
        {
            x[j]=x[j-1];

        //1st iteration  j=4,  8,7,3,7,7
        //2nd iteration j=3,   8,7,3,3,7
        //3rd iteration j=2,   8,7,7,3,7
        //4th iteration j=1,   8,8,7,3,7

        for(int j=n-1;j>1;j--){
            System.out.print(x[j]);
        }*/

        int[] x={8,7,3,7,4};



        for (int i=x.length-1;i>0;i--){

            System.out.print(x[i]);
            //1st iteration   4
            //2nd iteration   3
            //3rd iteration   2
            for(int j=0;j<=i;j++){
                System.out.print("*");
                //1st iteration  8
                //2nd iteration  7
                //3rd iteration  3
                //4th iteration  7
                //5th iteration  4


                //1st iteration  8
                //2nd iteration  7
                //3rd iteration  3
                //4th iteration  7

                //1st iteration  8
                //2nd iteration  7
                //3rd iteration  3
            }

            System.out.println();
        }

       // 1st iteration   4 8 7 3 7 4
        // 2nd iteration  7 8 7 3 7
        // 3nd iteration  3 8 7 3

    }
}
