public class Mathey {
    /* Write your own version of the Math.max method
     * Your method should be called max
     * This method should take **two integers** and return the larger integer
     * Ex. max(1, 2) => 2

     * You will need to practice writing the method signature below!
     * public static ...
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int max(int x, int y){
        if (x>y){
            return x;
        }else{
            return y;
        }
    }



    /* Write another method called max that takes **two doubles**
     * Ex. max(1.2, 4.0) => 4.0
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static double max(double x, double y){
        if(x-y>0){
            return x;
        }else{return y;
    }
    }



    /* Write another method called max that takes **three integers**
     * Ex. max(1, 4, 2) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int max(int a, int b, int c){
        return max(max(a,b), c);
    }



    /* Write another method called max that takes **four doubles**
     * Ex. max(1.0, 4.25, 1.3, 2.1) => 4.25
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static double max(double a, double b, double c, double d){
        if(max(a,b)-max(c,d)>0){
            return max(a,b);
        }else{
            return max(c,d);
        }
    }



    /* Write a method that takes **two integers** and generates a random
     * integer between the first integer and the second integer, inclusive
     * you may assume that the first integer is smaller than the second
     * You may use Math.random() here, but you can't use any other Math methods!
     * Ex. randomInteger(1, 4) => 3
     *     randomInteger(1, 4) => 2
     *     randomInteger(1, 4) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int randomInteger(int a, int b){
        return (int)(Math.random()*(1+b-a))+a;
    }

    public static int randomInteger(int a){
        return randomInteger(0,a);
    }







    // YOU MAY WORK ON THE FOLLOWING METHODS IF YOU FINISH EARLY

    /* Write a method that takes **two integers** and calculates the exponent
     * that you get by raising the first integer to the second integer
     * you may assume that both integers are positive
     * Ex. pow(2, 5) => 32
     *     pow(3, 4) => 81
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int pow(int a, int b){
        int c=1;
        while(b>0){
            c=c*a;
            b=b-1;
        }return c;
    }



    /* Write a method that takes **one integer** and returns the
     * absolute value of that integer
     * Ex. abs(2) => 2
     *     abs(-2) => 2
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
public static int abs(int a){
    if (a <= 0) {
        a = a * -1;
    }
    return a;
}



    /* Write a method that takes **one double** and returns the
     * integer value that you get by rounding that double
     * You may assume that the integer is positive
     * Ex. round(2.4) => 2
     *     round(2.5) => 3
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
public static int round(double a){
    int x = (int)  a;
    double check = a - x;
    if(check>=0.5){
        return x+1;
    }else{
        return x;
    }
}




    /* Write a method that takes **one double** and returns the
     * floor of that value
     * The floor is defined as the **largest** integer that is **less than**
     * or equal to some value
     * You may assume that the integer is positive
     * Ex. floor(2.4) => 2
     *     floor(2.999999999999) => 2
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
public static int floor(double a){
    int x = (int) a;
    return x;
}




    /* Write a method that takes **one double** and returns the
     * ceiling of that value
     * The ceiling is defined as the **smallest** integer that is **greater than**
     * or equal to some value
     * You may assume that the integer is positive
     * Ex. ceil(2.99999) => 3
     *     ceil(3.01) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
public static int ceil(double a){
    int x = (int)  a;
    double check = a - x;
    if(check>0){
        return x+1;
    }else{
        return x;
    }
}




    /* Calculates the square root iteratively, using the Babylonian method
     * This method has been provided for you
     */
    public static double sqrt(double x) {
        double x1 = 5;
        double prev = 0;

        while (Math.abs(prev - x1) > 0.0001) {
            prev = x1;
            x1 = (x1 + x/x1) / 2;
        }

        return x1;
    }
}