package com.max.idea;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Выберите что конвертировать, массу или расстояние, для выбора массы введите 1, для расстояния 2");
        double a= scan.nextDouble();
        if (a==1){
            System.out.println("Выбирите единицу измерения массы, для граммов введите +, для килограммов -, для центнеров *, для тонн /");
            char w;
            w=scan.next() .charAt (0);
            System.out.println("Введите число");
            double x= scan.nextDouble();
            switch (w) {
                case '+':
                    System.out.println(x + "г." + "\n" + x/1000 +"кг.\n" + x/100000 +"ц.\n" + x/1000000 +"т.");
                    break;
                case '-':
                    System.out.println(x + "кг." + "\n" + x*1000 +"г. \n" + x/100 +"ц.\n" + x/1000 +"т.");
                    break;
                case '*':
                    System.out.println(x + "ц." + "\n" + x*100000 +"г. \n" + x*100 +"кг.\n" + x*1000 +"т.");
                    break;
                case '/':
                    System.out.println(x + "т." + "\n" + x*1000000 +"г. \n" + x*1000 +"кг.\n" + x*10 +"ц.");
                    break;
            }

        }
        else {
            if(a==2){
                System.out.println("Выбирите единицу измерения расстояния, для метров введите +, для ярдов -, для футов *, для миль /");
                char w;
                w=scan.next() .charAt (0);
                System.out.println("Введите число");
                double x= scan.nextDouble();
                switch (w) {
                    case '+':
                        System.out.println(x + "м." + "\n" + x*1.094 +"я. \n" + x*3.281 +"ф.\n" + x/1609 +"ми.");
                        break;
                    case '-':
                        System.out.println(x + "я." + "\n" + x/1.094 +"м. \n" + x*3 +"ф.\n" + x/1760 +"ми.");
                        break;
                    case '*':
                        System.out.println(x + "ф." + "\n" + x/3.28 +"м. \n" + x/3 +"я.\n" + x/5280 +"ми.");
                        break;
                    case '/':
                        System.out.println(x + "ми." + "\n" + x*5280 +"ф. \n" + x*1760 +"я.\n" + x*1609 +"м.");
                        break;
                }
        }
    }

}
}
