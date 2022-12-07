package com.max.idea;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println("Введите размер массива");
        int size = scan.nextInt();
        int array [] = new int[size];
        System.out.println("Заполните массив");
        for (int a = 0; a < size; a++) {
            array[a] = scan.nextInt();
            if (array[a] != x && array[a] != y && array[a] != z) {
                continue;
            }
            if (array[a] == x || array[a] == y || array[a] == z) {
                System.out.println("Данное значение имеется в константах:" + " " + array[a]);
            }
        }
        System.out.print("Массив");
        for (int a = 0; a < size; a++){
                System.out.print(" " + array [ a ]);
            }

        }

    }


