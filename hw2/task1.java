import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        // Задание №1
        // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
        // (типа float), и возвращает введенное значение. Ввод текста вместо числа не
        // должно приводить к падению приложения, вместо этого, необходимо повторно
        // запросить у пользователя ввод данных.

        System.out.println(getFloatNumber());
    }

    public static Float getFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите дробное число: ");
            Float inputNumber = Float.parseFloat(scanner.nextLine());
            scanner.close();
            return inputNumber;
        } catch (Exception e) {
            System.out.println("Введенны некорректные данные!");
            return getFloatNumber();
        }
    }

}