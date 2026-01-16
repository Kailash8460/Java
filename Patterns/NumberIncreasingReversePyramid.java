package Patterns;

import java.util.*;

public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }

    public static void printPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
