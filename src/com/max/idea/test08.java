package com.max.idea;
import java.util.Scanner;
public class test08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scan.nextInt();
        double array[] = new double[size];
        System.out.println("Заполните массив");
        for (int a = 0; a < size; a++) {
            array[a] = scan.nextInt();
        }
        double average = 0;
        for (int a = 0; a < size; a++) {
            average += array[a];
        }
        average /= size;
        System.out.print("Массив * среднее арифметическое"+" "+average+"\n");
        for (int a = 0; a < size; a++) {
            System.out.println(average * array [ a ]);
        }
    }
}