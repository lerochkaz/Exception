import java.io.IOException;

public class NotBirthdateFormateException extends IOException {
    public NotBirthdateFormateException() {
        super("Ошибка! Дата рождения должна быть введена в формате dd.mm.yyyy");
    }
}
