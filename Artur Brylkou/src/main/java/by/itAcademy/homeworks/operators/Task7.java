package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(closeCircle(a, b, r));
    }

    public static boolean closeCircle(int a, int b, int r) {
        int diameter = 2 * r;
        int hypotenuse = (int) Math.sqrt(a * a + b * b);
        if (diameter >= hypotenuse) {
            return true;
        } else {
            return false;
        }
    }
}
