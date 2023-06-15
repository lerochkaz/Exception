import java.io.IOException;

public class NotPhoneNumberFormateException extends IOException {
    public NotPhoneNumberFormateException() {
        super("Ошибка! Телефонный номер должен иметь цифровой формат 8XXXXXXXXXX");
    }
}
