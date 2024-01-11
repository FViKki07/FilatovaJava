package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    static void Task1(int number){
        if(number > 7)
            System.out.println("Задание1: Привет");
    }

    static void Task2(String name){
        String answer = name.equals("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени";
        System.out.println(answer);
    }


    static void Task3(int[] arr){
        for(int x: arr){
            if(x % 3 == 0){
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();
        Task1(num);

        in.nextLine();

        System.out.print("Введите имя: ");
        String name = in.nextLine();
        Task2(name);

        System.out.print("Введите массив через пробел: ");
        String str = in.nextLine();
        String[] arrStr = str.split("\\s+");
        int[] numbers = new int[arrStr.length];
        try {
            for (int i = 0; i < arrStr.length; i++) {
                numbers[i] = Integer.parseInt(arrStr[i]);
            }
            Task3(numbers);
        }
        catch (NumberFormatException e){
            System.out.println("Вы ввели не массив чисел");
        }

    }
}

/*
Задание 4. Дана скобочная последовательность: [((())()(())]]
Эта последовательность неправильная, так как количество открывающихся скобок должно быть равно
количеству закрывающихся скобок такого же вида, причем если скобки одного вида обрамлены скобками другого вида,
то количество обрамленных нужно считать отдельно от внешних.
Итого мы имеем, что квадратная скобка закрывается лишний раз и лишняя круглая( 6 открытых и 5 закрытых круглых )
 */