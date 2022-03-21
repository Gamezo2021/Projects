package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день от 1 до 7");
        int day = sc.nextInt();
        System.out.println(dayPlan(day));
    }
    public static String dayPlan(int number){
        String day;
        switch (number){
            case 1:
                day = "Понедельник: рабочий день";
                break;
            case 2:
                day = "Вторник: рабочий день";
                break;
            case 3:
                day = "Среда: выходной";
                break;
            case 4:
                day = "Четверг: выходной";
                break;
            case 5:
                day = "Пятница: рабочий день";
                break;
            case 6:
                day = "Суббота: рабочий день";
                break;
            case 7:
                day = "Воскресенье: выходной";
                break;
            default: day = "Неверное значение";
        } return day;
    }
}
