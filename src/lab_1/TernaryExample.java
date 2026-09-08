package lab_1;

public class TernaryExample {

    public static void main(String[] args) {

        int number = 10;

        String result = (number % 2 == 0)
                ? "Чётное"
                : "Нечётное";

        System.out.println(result);
    }
}