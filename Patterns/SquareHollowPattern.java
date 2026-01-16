package Patterns;

import java.util.*;

public class SquareHollowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the square: ");
        int breadth = sc.nextInt();
        printPattern(length, breadth);
        sc.close();
    }

    public static void printPattern(int length, int breadth) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < breadth; j++) {
                if (i == 0 || i == length - 1 || j == 0 || j == breadth - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
