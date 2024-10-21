public class Restaurant {

    String name;
    int rating;

    public Restaurant(){ // default constructor
        this.name ="no name";
        this.rating= 0;
        System.out.println("Hello");
    }
    public Restaurant(int initRating, String initName) {  //parameterized constructor

        this.name = initName;
        this.rating = initRating;
        System.out.println("Hello");
    }

    public Restaurant(String name) {  //parameterized constructor

        this.name = name;
        this.rating = 0;
    }

    public static void main(String[] args) {
      //  String restaurant = new Restaurant(3,"Taco Bell"); error

       // ClassName objName = new ClassName(firstParameter,SecondParameter, and so on .....); way to define the objects
       // ClassName objName = new ClassName();
      //  new Restaurant myRest = Restaurant();  error


        //
      //  Restaurant fastFood = new Restaurant("Chilli's");

        int a=19;
        int b=a+9;

        while (a<b){
            a=a+1;
            b=b-2;
        }
        System.out.print(a+b);

        //1st iteration   a=19,b=28     a->20,b->26
        //2nd iteration   a=20,b=26     a->21,b->24
        //3rd iteration   a=21,b=24     a->22,b->22
        //44 output




    }
}
