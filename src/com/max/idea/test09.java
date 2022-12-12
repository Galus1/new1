package com.max.idea;
import java.util.Scanner;
public class test09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 3;
        System.out.println("Введите размер матрицы");
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        int[][] matrix = new int[size1][size2];
        System.out.println("Заполните матрицу");
        for (int a = 0; a < size1; a++) {
            for (int b = 0; b < size2; b++) {
                matrix[a][b] = scan.nextInt();
            }
                }
        System.out.print("Матрица *" + x + ":" + "\n");
        for (int a = 0; a < size1; a++) {
            for (int b = 0; b < size2; b++) {
                System.out.println(x * matrix[a][b]);
            }
            System.out.println();
        }
    }
}