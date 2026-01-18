import java.util.ArrayList;
import java.util.Scanner;

public class ConvertIntegerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Number: ");
        int num = sc.nextInt();
        String result1 = UsingArrayList(num);
        String result2 = UsingArrayList(num);
        System.out.println("Binary Number of " + num + " is: Result1 - " + result1);
        System.out.println("Binary Number of " + num + " is: Result2 - " + result2);
        sc.close();
    }

    public static String UsingArrayList(int num) {
        ArrayList<Integer> binaryNum = new ArrayList<>();
        boolean condition = true;
        while (condition) {
            int remainder = num % 2;
            if (num == 1) {
                remainder = 1;
                condition = false;
            } else {
                num = num / 2;
            }
            binaryNum.add(remainder);
        }
        String result = "";
        for (int i : binaryNum.reversed()) {
            result = result + String.valueOf(i);
        }
        return result;
    }

    public static String UsingLogic(int num) {
        String result = "";
        while (num >= 0) {
            int remainder = num % 2;
            num = num / 2;
            result = String.valueOf(remainder) + result;
        }
        return result;
    }

}
