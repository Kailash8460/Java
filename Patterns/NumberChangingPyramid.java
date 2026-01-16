package Patterns;

import java.util.*;

public class NumberChangingPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        printPattern(rows);
        sc.close();
    }

    public static void printPattern(int rows) {
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println("");
        }
    }
}
