package com.max.idea;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z;
        char oper;
        System.out.print("Введите оператор (+, -, *, /): ");
        oper= scan.next() .charAt (0);
        switch (oper) {
            case '+': z=x+y;
            break;
            case '-': z=x-y;
                break;
            case '*': z=x*y;
                break;
            case '/': z=x/y;
                break;
            default:
                System.out.printf("Ошибка, введите корректный оператор");
                return;

        }
        System.out.printf(x+" "+oper+" "+y+"="+z);
    }
}
