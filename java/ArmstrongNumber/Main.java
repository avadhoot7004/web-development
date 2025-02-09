import java.util.Scanner;

public class Main {
    public void isArmstrong(int num) {
        int originalNum = num;
        int cubedSum = 0;
        int temp;
        while (num > 0) {
            temp = num % 10;
            cubedSum += Math.pow(temp, 3);
            num = num / 10;
        }
        if (cubedSum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong Number.");
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");
        int number = sc.nextInt();

        obj.isArmstrong(number);
    }
}

