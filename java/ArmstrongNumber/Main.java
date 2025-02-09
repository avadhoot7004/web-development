import java.util.Scanner;

public class Main {
    public void isArmstrong(long num) {
        long originalNum = num;
        long digits = String.valueOf(num).length();
        long exonentSum = 0;
        long temp;

        while (num > 0) {
            temp = num % 10;
            exonentSum += Math.pow(temp, digits);
            num = num / 10;
        }
        if (exonentSum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong Number.");
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check: "); //used long to check 4679307774 which is out of int range and is an armstrong number
        long number = sc.nextLong(); 

        obj.isArmstrong(number);
    }
}

