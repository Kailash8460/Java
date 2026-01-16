package Patterns;

import java.util.*;

public class NumberIncreasingPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the increasing pyramid pattern: ");
        int rows = 5;
        // int rows = sc.nextInt();
        printPattern(rows);
        sc.close();
    }

    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}