import java.io.IOException;

public class NullStringException extends IOException {
    public NullStringException() {
        super("Ошибка! Пользователь не ввел данные!");
    }
}