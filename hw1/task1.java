import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        // Задание №1.
        // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

        // System.out.println(divisionOfNumbers(10, 0));

        // int[] arr = { 10, 1, 2, 0 };
        // System.out.println(outputNumberFromArray(arr, 4));

        System.out.println(scanText());
    }

    public static int divisionOfNumbers(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public static int outputNumberFromArray(int[] array, int numberElement) {
        return array[numberElement];
    }

    public static String scanText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        scanner.close();
        return scanner.nextLine();
    }
}
