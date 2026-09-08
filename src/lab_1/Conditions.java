package lab_1;

public class Conditions {

    public static void main(String[] args) {

        int age = 20;
        boolean hasTicket = true;

        if (age >= 18 && hasTicket) {
            System.out.println("Можно пройти");
        } else {
            System.out.println("Проход запрещён");
        }

        int day = 6;

        if (day == 6 || day == 7 || day == 0) {
            System.out.println("Выходной");
        } else {
            System.out.println("Рабочий день");
        }

        boolean hasPermission = false;

        if (age >= 18 && (hasTicket || hasPermission)) {
            System.out.println("Доступ разрешён");
        } else {
            System.out.println("Доступ запрещён");
        }

        int score = 75;

        if (score >= 90) {
            System.out.println("Оценка: 5");
        } else if (score >= 70) {
            System.out.println("Оценка: 4");
        } else if (score >= 50) {
            System.out.println("Оценка: 3");
        } else {
            System.out.println("Оценка: 2");
        }
    }
}