package by.yurtsevich.automation_training.mainTasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Сумма чисел: " + (number1 + number2));
    }
}