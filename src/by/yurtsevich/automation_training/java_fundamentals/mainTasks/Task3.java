package by.yurtsevich.automation_training.java_fundamentals.mainTasks;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        RandomNumbers num = new RandomNumbers();
        num.setN();
        num.setMyArray(num.getN());
        num.showMyArray();
        num.showLnMyArray();
    }
}

class RandomNumbers {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private int N = 0;
    private int[] myArray;

    public void setN() {
        System.out.print("Введите количество случайных чисел: ");
        N = scanner.nextInt();
        myArray = new int[N];
    }

    public int getN() {
        return N;
    }

    public void setMyArray(int N) {
        for (int i = 0; i < N; i++) {
            myArray[i] = random.nextInt();
        }

    }

    public void showMyArray() {
        System.out.print("Массив случайных чисел без перехода на новую строку: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public void showLnMyArray() {
        System.out.println("Массив случайных числес с переходом на новую строку: ");
        for (int value : myArray) {
            System.out.println(value);
        }
    }
}