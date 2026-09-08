package lab_1;

public class SwitchExample {

    public static void main(String[] args) {

        int month = 2;

        switch (month) {
            case 1:
                System.out.println("Январь");
                break;

            case 2:
                System.out.println("Февраль");
                break;

            case 3:
                System.out.println("Март");
                break;

            default:
                System.out.println("Такого месяца нет");
        }
    }
}