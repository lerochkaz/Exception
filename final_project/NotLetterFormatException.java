import java.io.IOException;

public class NotLetterFormatException extends IOException {
    public NotLetterFormatException() {
        super("Ошибка! Фамилия имя отчество должны соответсвовать буквенному формату");
    }
}
