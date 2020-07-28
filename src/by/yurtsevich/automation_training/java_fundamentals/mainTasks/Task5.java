package by.yurtsevich.automation_training.java_fundamentals.mainTasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.print("Январь");
            case 2:
                if (month == 2) {
                    System.out.print("Февраль");
                }
            case 3:
                if (month == 3) {
                    System.out.print("Март");
                }
            case 4:
                if (month == 4) {
                    System.out.print("Апрель");
                }
            case 5:
                if (month == 5) {
                    System.out.print("Май");
                }
            case 6:
                if (month == 6) {
                    System.out.print("Июнь");
                }
            case 7:
                if (month == 7) {
                    System.out.print("Июль");
                }
            case 8:
                if (month == 3) {
                    System.out.print("Август");
                }
            case 9:
                if (month == 9) {
                    System.out.print("Сентябрь");
                }
            case 10:
                if (month == 10) {
                    System.out.print("Октябрь");
                }
            case 11:
                if (month == 11) {
                    System.out.print("Ноябрь");
                }
            case 12:
                if (month == 12) {
                    System.out.print("Декабрь");
                }
        }
    }
}

