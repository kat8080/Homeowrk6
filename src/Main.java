public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1
        System.out.println("Домашнее задание 1");
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i<11; i++){
            System.out.println(i);
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        //Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i < 18; i = i+2) {
            System.out.println(i);
        }

        //Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i > -11; i--){
            System.out.println(i);
        }

        //Домашнее задание 2
        System.out.println("Домашнее задание 2");
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 1904; i < 2097; i = i + 4)
            if (i % 4 == 0 && i%100!=0 || i%400==0){
                System.out.println(i + " год является високосным");
            }

        //Задание 3
        System.out.println("Задание 3");
        for (int i = 7; i<99; i+=7) {
            System.out.println(i + " ");
        }
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");
        for (int i = 1; i<513; i=i*2){
            System.out.println(i);
        }

        //Домашнее задание 3
        System.out.println("Домашнее задание 3");
        //Задание 1
        System.out.println("Задание 1");
        int sum = 29_000;
        int total = 0;
        for (int i = 1; i <13; i++){
            total = total+sum; {
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей.");
        }}

        //Задание 2
        System.out.println("Задание 2");
        int suma = 29000;
        int total2 = 0;
        for (int i = 1; i <13; i++){
            total2 = total2 +suma/100;
            total2 = total2+suma; {
                System.out.println("Месяц " + i + " , сумма накоплений равна " + total2);
            }


        }

    }
}