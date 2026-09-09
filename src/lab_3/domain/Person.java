package lab_3.domain;

public class Person {

    private final String firstName;
    private final String secondName;
    private int age;
    private String phone;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public Person(String firstName, String secondName, int age,
                  String phone) throws InvalidPhoneNumberException {

        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;

        setPhone(phone);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone)
            throws InvalidPhoneNumberException {

        if (phone == null || !phone.matches("\\d{11}")) {
            throw new InvalidPhoneNumberException(
                    "Некорректный номер телефона: " + phone
            );
        }

        this.phone = phone;
    }
}