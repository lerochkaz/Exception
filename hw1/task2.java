public class task2 {
    public static void main(String[] args) {
        // Задание №2
        // Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете
        // получить?

        String array[][] = {
                { "1", "0", "1", "1" },
                { "1", "0", "1", "1" },
                { "1", "0", "1", "1" },
                { "1", "0", "1", "1" } };
        System.out.println(sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // В данной строке необходимо внести изменения j < arr[i].length
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

}
