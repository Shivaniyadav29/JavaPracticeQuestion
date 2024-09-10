package Lab5;
import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;
        System.out.println("Enter number");
        while(true) {
            int n = sc.nextInt();
            if(n == -1) {
                break;
            }
            else if(n % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Total even numbers : " + evenCount);
        System.out.println("Total odd numbers  : " + oddCount);
    }
}

