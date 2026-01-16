import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        int sum = addition(num1, num2);
        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + sum);
        sc.close();
    }

    public static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
