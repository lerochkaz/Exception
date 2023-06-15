import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application implements Startable {

    private static void greeting() {
        System.out.println(
                "Введите данные пользователя разделенные пробелом: Фамилия Имя Отчество датарождения номертелефона пол: ");
    }

    private static String getStringData(Scanner scanner) {
        return scanner.nextLine();
    }

    private static boolean checkingCorrectQuantity(String[] dataArray, int size) throws WrongQuantityException {
        if (dataArray.length != size) {
            throw new WrongQuantityException();
        }
        return true;
    }

    private static boolean checkingString(String data) throws NullStringException {
        if (data.isEmpty()) {
            throw new NullStringException();
        }
        return true;
    }

    private static boolean checkingForLetters(String data) throws NotLetterFormatException {
        if (!data.matches("[a-zA-Z-а-яА-Я]+")) {
            throw new NotLetterFormatException();
        }
        return true;
    }

    private static boolean checkingForBirthdate(String data) throws NotBirthdateFormateException {
        if (!data.matches("\\d{2}.\\d{2}.\\d{4}")) {
            throw new NotBirthdateFormateException();
        }
        return true;
    }

    private static boolean checkingForPhoneNumber(String data) throws NotPhoneNumberFormateException {
        if (!data.matches("8\\d{10}")) {
            throw new NotPhoneNumberFormateException();
        }
        return true;
    }

    private static boolean checkingForGender(String data) throws NotGenderFormateException {
        if (!(data.equals("f") || data.equals("m"))) {
            throw new NotGenderFormateException();
        }
        return true;
    }

    private static boolean checkingArrayElement(String[] dataArray) throws IOException {
        try {
            for (int i = 0; i < 3; i++) {
                checkingForLetters(dataArray[i]);
            }
            checkingForBirthdate(dataArray[3]);
            checkingForPhoneNumber(dataArray[4]);
            checkingForGender(dataArray[5]);
        } catch (IOException e) {
            throw e;
        }
        return true;
    }

    private static String[] conversionToArray(String data) throws IOException {
        String[] dataArray = null;
        try {
            checkingString(data);
            dataArray = data.split(" ");
            checkingCorrectQuantity(dataArray, 6);
            checkingArrayElement(dataArray);
        } catch (IOException e) {
            throw e;
        }
        return dataArray;
    }

    private static String[] getArray(Scanner scanner) {
        try {
            greeting();
            return conversionToArray(getStringData(scanner));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return getArray(scanner);
        }
    }

    private static Person getPerson(String[] arrayData) {
        return new Person(arrayData[0], arrayData[1], arrayData[2], arrayData[3], arrayData[4],
                arrayData[5]);
    }

    private static void writeToFile(Person person) {
        File file = new File(person.getSurname() + ".txt");
        boolean flag = file.exists();
        try (FileWriter writer = new FileWriter(file, true)) {
            if (flag)
                writer.write("\n");
            writer.write(person.toString());
            System.out.println(person);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            writeToFile(getPerson(getArray(scanner)));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}