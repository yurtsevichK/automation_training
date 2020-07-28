package by.yurtsevich.automation_training.java_fundamentals.optionalTasks1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String longNumber = "", shortNumber = line;
        for (String s : line.split(" ")) {
            if (s.length() > longNumber.length()) longNumber = s;
            if (s.length() < shortNumber.length()) shortNumber = s;
        }
        System.out.println("Самое длинное число: '" + longNumber + "'");
        System.out.println("Длина: " + longNumber.length());
        System.out.println("Самое короткое число: '" + shortNumber + "'");
        System.out.println("Длина: " + shortNumber.length());
    }
}