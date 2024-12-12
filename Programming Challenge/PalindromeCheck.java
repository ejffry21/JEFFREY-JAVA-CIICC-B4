import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // Use StringBuilder to reverse the string
        String reversed = new StringBuilder(input).reverse().toString();
        // Check if the original string is equal to the reversed string
        if (input.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}