package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String figure;
        System.out.print("Привет! Я могу посчитать площадь прямоугольника.\nВведите длину первой стороны(в см):");
        int lenght = inputValue();
        System.out.print("Введите длину второй стороны(в см):");
        int width = inputValue();
        int area = lenght * width;
        if (lenght == width) {
            figure = "квадрата";
        }else {
            figure = "прямоугольника";
        }
        System.out.printf("Площадь %s со сторонами %s и %s равна %s см^2%n",figure, lenght, width, area);
    }

    public static int inputValue() {
        while (true) {
            int num = isDigit();
            if (num > 0) {
                return num;
            } else {
                System.out.print("Некорректный ввод!Введите положительное целое число: ");
            }
        }
    }

    public static int isDigit() {
        while (true) {
            try {
                return new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.print("Некорректный ввод!Введите положительное целое число: ");
            }
        }
    }
}
