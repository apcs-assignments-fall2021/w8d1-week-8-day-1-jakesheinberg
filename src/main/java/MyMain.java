import java.util.Scanner;

public class MyMain {


    public static int randomTeen() {
        int x = (int) Math.random()*10+11;
        return x;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
       int x = (int) (Math.random()*11)+10;
       int y = (int) (Math.random()*11)+10;
       int z = (int) (Math.random()*11)+10;

        System.out.println("the three numbers are " + x + " "+y+" " + z);
        if(x>y && x>z){
            System.out.println(x + " is the largest");
        }else if(y>z && y> x){
            System.out.println(y + " is the largest");
        }else{
            System.out.println(z+ " is the largest");
        }
        if(x<y && x<z){
            System.out.println(x + " is the largest");
        }else if(y<z && y< x){
            System.out.println(y + " is the largest");
        }else{
            System.out.println(z+" is the largest");
        }

        int a =5;
        int b=12;
        int csqrd = Mathey.pow(a,2) + Mathey.pow(b,2);
        double c = Mathey.sqrt(csqrd);
        System.out.println(c);




       // Uncomment this code later!
        System.out.println("Mathey.max tests");
        System.out.println(Mathey.max(1, 2)); // 2
        System.out.println(Mathey.max(2, 1)); // 2
        System.out.println(Mathey.max(3.2, 4.5));
        System.out.println(Mathey.max(1,2,3));
        System.out.println(Mathey.max(2.1,2.2,2.3,2.4));
        System.out.println(Mathey.randomInteger(2,7));
        System.out.println(Mathey.randomInteger(7));
        System.out.println(Mathey.pow(2,2));
        System.out.println(Mathey.abs(-1));
        System.out.println(Mathey.round(2.5));
        System.out.println(Mathey.floor(2.4));
        System.out.println(Mathey.ceil(2.4));
    }

}


