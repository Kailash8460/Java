package Patterns;

import java.util.*;

public class NumberTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangular pattern: ");
        int rows = sc.nextInt();
        printPattern(rows);
        sc.close();
    }

    public static void printPattern(int rows) {
        int i, j;
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
