package by.itAcademy.homeworks.enums;

import java.util.Scanner;

/**Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне. Входной параметр ввести с клавиатуры.*/
public class Task37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Season season = Season.valueOf(sc.nextLine().toUpperCase());
        System.out.println(season.getCountOfDays());
    }
}
