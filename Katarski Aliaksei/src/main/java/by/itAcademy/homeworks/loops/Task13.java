package by.itAcademy.homeworks.loops;

/**
 * > Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 */

public class Task13 {
    public static void main(String[] args){
        int a=1;
        int res=1;
        System.out.println(res);
        do{
           res*=a;
        }while(a<=25);
        System.out.println(res);
    }
}
