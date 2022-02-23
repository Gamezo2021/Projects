/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает
3. поменять функцию обработчик так, чтобы она выводила только числа которые делятся на 3
* */

package by.itAcademy.homeworks.basics;

public class Sample3 {
    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
     * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i=0;i<10;i++){//для цулочисленного i установить значение 0;выполнять блок пока i меньше 10; после каждого исполнения увеличить i на 1
            processNumber(i);//Вызываем определенную ниже функцию processNumber. Передаем в качестве параметра значение i
        }
    }

    private static void processNumber(int num){ //определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        if (num%3==0 ){ //если остаток от деления на 2 равен 0 то выполняем данный блок
            System.out.println(num);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
        }
    }
}