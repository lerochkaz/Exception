import java.io.IOException;

public class WrongQuantityException extends IOException {
    public WrongQuantityException() {
        super("Ошибка! Колличество введенных данных не соответсвует колличеству запрошенных!");
    }
}