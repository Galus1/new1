package com.max.idea;

import java.util.Scanner;
public class test03 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Введите числа x, y, z");
        double x= scan.nextDouble();
        double y= scan.nextDouble();
        double z= scan.nextDouble();
        double a=((x+y+z)/3);
        System.out.println(a);
if (Math.floor(a/2)>3){
System.out.println("Программа выполнена корректно");
return;
        }
System.out.println("Попробуйте еще раз");

    }
}
