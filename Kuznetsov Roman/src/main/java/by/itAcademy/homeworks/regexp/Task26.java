package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("[.]{3,}|\\?+!+|!+\\?+|!+|\\?+|[.,;:\\-\"]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
           count++;
        }
        System.out.println(count);
    }
}
