package Patterns;

import java.util.*;

public class PalindromeTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        // int rows = 4;
        printPattern(rows);
        sc.close();
    }

    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" " + " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
