package by.itAcademy.homeworks.objects;

/**
 * Создать класс,который будет описывать промежуток времени и иметь 3 свойства(секунды,минуты,часы).
 * Сделать метод для получения кол-ва секунд в обьекте.
 * метод для сравнения 2 обьектов(как compareTo в строках).
 * Сделать 2 конструктора:
 * получающий общее количество секунд
 * > - получающий часы, минуты и секунды по отдельности.
 * > Сделать метод для вывода данных.
 */

public class Task24 {
    public static void main(String[] args) {
    Time day=new Time(12,22,33);
    Time night=new Time(23,49,22);
    Time a=new Time(50000);
    System.out.println(a);
    }
}
