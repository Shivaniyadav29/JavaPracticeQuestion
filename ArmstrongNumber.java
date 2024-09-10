package Lab5;
import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int number, rem, res = 0;
        number = n;
        while (number != 0) {
            rem = number % 10;
            res += rem * rem * rem;
            number /= 10;
        }

        if (n == res)
            return true;
        else
            return false;
    }
    public static void printArmstrongNumber(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + " are : ");
        for(int i = start; i <= end; i++) {
            if(isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number :");
        int end = sc.nextInt();
        printArmstrongNumber(start, end);
    }
}

