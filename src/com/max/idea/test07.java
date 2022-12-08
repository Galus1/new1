package com.max.idea;
import java.util.Scanner;
public class test07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 - 1 == 0) {
                sum = sum + i;
            }
        }
        System.out.print(sum);
    }
}