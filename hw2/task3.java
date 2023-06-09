
public class task3 {

    // Задание №3
    // Исправить код
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 10;
            printDivision(a, b);
            printSum(a, b);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws RuntimeException {
        try {
            System.out.println(a + b);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static void printDivision(Integer a, Integer b) throws ArithmeticException {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            throw e;
        }
    }

}
