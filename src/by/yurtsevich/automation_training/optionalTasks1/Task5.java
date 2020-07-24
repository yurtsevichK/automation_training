package by.yurtsevich.automation_training.optionalTasks1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int n;
        System.out.println("Введите n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] massiv_chisel = new int[n];

        int chet_qiwra = 0;
        int nechet_qiwra = 0;

        int chet_itog = 0;
        int nechet_chet_itog = 0;

        for (int s = 0; s < n; s++) {

            System.out.println("Число " + (s + 1) + " : ");
            massiv_chisel[s] = scanner.nextInt();

            ArrayList<Integer> qiwri = new ArrayList<>();
            while (massiv_chisel[s] != 0) {
                qiwri.add(massiv_chisel[s] % 10);
                massiv_chisel[s] /= 10;
            }

            for (Integer integer : qiwri) {
                if (integer % 2 == 0) chet_qiwra++;
                else nechet_qiwra++;
            }

            if (chet_qiwra == qiwri.size()) chet_itog++;
            else if (chet_qiwra == nechet_qiwra) nechet_chet_itog++;

            chet_qiwra = 0;
            nechet_qiwra = 0;
        }
        System.out.println("Цифр состоящих только из четных чисел : " + chet_itog + "\nА чисел, где кол-во четных и нечетных чисел равны : " + nechet_chet_itog);
    }
}
