package by.itAcademy.homeworks.objects;

public class Task25 {

    /**Task25
     * Создать класс, описывающий Банкомат. Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
     * количеством купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат.
     * Сделать метод, снимающий деньги. С клавиатуры передается сумма денег. На экран – булевское значение (операция удалась или нет).
     * При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
     * Создать конструктор с тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.
     */

    public static void main(String[] args) {
        Bankomat cash = new Bankomat(0, 0, 0);


        if (cash.getBanknot_20() < 0 || cash.getBanknot_50() < 0 || cash.getBanknot_100() < 0){
            System.out.println("Error: enter correct number");
        } else {
            System.out.println(cash.putCash(20000,100,0));
        }

        cash.outCash(15443);



    }
}
