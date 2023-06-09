import java.io.IOException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        // Задание №4
        // Разработайте программу, которая выбросит Exception, когда пользователь вводит
        // пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
        System.out.println(getText());
    }

    public static String getText() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите текст: ");
            String inputText = scanner.nextLine();
            validationString(inputText);
            return inputText;
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    public static void validationString(String str) throws IOException {
        if (str.isEmpty()) {
            throw new IOException("Пустые строки вводить нельзя!");
        }
    }
}
