package Task119;
import java.util.Scanner;

public class ArithmeticOperation {
    
    public static double addition(double a, double b){
        return a+b;
    }
    public static double subtraction(double a, double b){
        return a-b;
    }
    public static double multiplication(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        if(b==0 ){
            System.out.println("error division by zero");
            return 0;
        }
        return (a/b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input First number");
        double a=s.nextFloat();
        System.out.println("input Second number");
        double b=s.nextFloat();

        System.out.println("Sum is: "+addition(a,b));
        System.out.println("Difference is: "+subtraction(a,b));
        System.out.println("Product is: "+multiplication(a,b));
        System.out.println("Quotient is: "+division(a,b));

        s.close();
    }
}