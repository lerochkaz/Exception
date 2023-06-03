public class task3 {
    public static void main(String[] args) {
        // Задание №3
        // Реализуйте метод, принимающий в качестве аргументов два целочисленных
        // массива, и возвращающий новый массив, каждый элемент которого равен разности
        // элементов двух входящих массивов в той же ячейке. Если длины массивов не
        // равны, необходимо как-то оповестить пользователя.

        int[] oneArr = { 1, 2, 3 };
        int[] twoArr = { 1, 2, 3, 4 };
        printArray(getNewArray(oneArr, twoArr));
    }

    public static int[] getNewArray(int[] firstArray, int[] secondArray) {

        int[] newArray = null;

        try {
            compareLength(firstArray, secondArray);
            newArray = new int[firstArray.length];
            for (int i = 0; i < firstArray.length; i++) {
                newArray[i] = firstArray[i] - secondArray[i];
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return newArray;
    }

    public static void compareLength(int[] firstArray, int[] secondArray) throws Exception {
        if (firstArray.length != secondArray.length) {
            throw new Exception("Ошибка! Разные длины массивов");
        }
    }

    public static void printArray(int[] array) {
        if (array != null) {
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }

}
