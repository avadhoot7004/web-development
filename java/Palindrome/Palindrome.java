import java.util.Scanner;

public class Palindrome {

    public void isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        if (reversed.equalsIgnoreCase(input)) {
            System.out.println("String is Palindrome");
        }
    }

    public static void main (String[] args) {
        Palindrome obj = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (char or num): ");
        String inputVal = sc.nextLine();

        obj.isPalindrome(inputVal);
    }
}
