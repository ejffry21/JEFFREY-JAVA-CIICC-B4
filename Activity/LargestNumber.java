import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input first number: ");
        int num1 = scanner.nextInt();

        System.out.println("input second number: ");
        int num2 = scanner.nextInt();

        System.out.println("input third number: ");
        int num3 = scanner.nextInt();

        if (num1==num2 && num2==num3) {
            System.out.println("all numbers are equal!");
        }else{
            int largest = num1;
            if (num2>largest) {
                largest = num2;
            }
            if (num3>largest) {
                largest = num3;
            }
            System.out.println("the largest is "+largest); 
        }
    }
}
