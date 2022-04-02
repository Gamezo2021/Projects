package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String str = sc.nextLine();
        Pattern p = Pattern.compile("[\\.]{3}|[\\?|\\!][\\?\\!\\.]*|[\\?!\\.,\\-;:]");
        Matcher m = p.matcher(str);
        int marks =0;
        while (m.find()){
            marks++;
        }
        System.out.println(marks);
    }
}
