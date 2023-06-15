public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String phoneNumber;
    private String gender;

    public Person(String surname, String name, String patronymic, String birthday, String phoneNumber, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.surname + " " + this.name + " " + this.patronymic + " " + this.birthday + " " + this.phoneNumber
                + " " + this.gender;
    }

    public String getSurname() {
        return surname;
    }
}
