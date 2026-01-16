import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Your num1 and num2 are: " + num1 + ", " + num2);
        System.out.println("Swapping...");
        tempVariable(num1, num2);
        arithmeticLogic(num1, num2);
        System.out.println("Swappd Successfully.");
        sc.close();
    }

    public static void tempVariable(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Using Temp Variable, Your num1 and num2 are: " + num1 + ", " + num2);
    }

    public static void arithmeticLogic(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Using Arithmetic Logic, Your num1 and num2 are: " + num1 + ", " + num2);
    }
}
