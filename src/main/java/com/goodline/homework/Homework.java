package com.goodline.homework;

import com.goodline.helpers.Variables;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Homework {
    // В этом массиве неизвестно сколько элементов
    // Количество элементов всегда разное
    static String[] names = Variables.names;

    // Массив с числами
    static int[] numbers = Variables.numbers;

    private static void main(String[] args)
    {

        printEven()
        printNames()
           getCount();
    }

    private static int[] printEven() {
        // Вернуть массив четных чисел меньше 100
        int [] chetnie=new int[numbers.length];
        for (int i =0;i<numbers.length ;i+=1)
        {
         if((numbers[i]%2) ==0 && numbers[i]<100)
         {
             chetnie[i]=numbers[i];
             System.out.println(chetnie[i]);
         }
        }

        return chetnie;
    }

    private static void printNames() {
        for(int i=0;i< names.length;i++)
        {
            System.out.println(names[i]);
        }
       // Вывести все элементы массива names
    }

    private static int getCount() {
        ArrayList <Integer> division = new ArrayList<>();

        for (int i =0;i<numbers.length ;i+=1)
        {
            if((numbers[i]%3) ==0 || (numbers[i]%7) ==0)
            {
               division.add(numbers[i]);

            }
        }

        System.out.println(division.size());
        // Вернуть количество цифр, которые делятся на 3 и 7 без остатка в массиве numbers
        return division.size();


    }

    private static void printCounts() {
        // СЛОЖНОЕ ЗАДАНИЕ
        // Вывести количество всех цифр в массиве numbers
        // Допустим [1, 1, 1, 2, 2, 3, 3, 3, 4]
        // Значит надо вывести 1:3 2:2 3:3 4:1
    }
}
