import java.io.IOException;

public class NotGenderFormateException extends IOException {
    public NotGenderFormateException() {
        super("Ошибка! Пол должен быть введен символами \"f\" или \"m\"");
    }
}
