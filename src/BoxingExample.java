public class BoxingExample {

    public static void main(String[] args) {

        int a = 10;
        Integer b = a;

        int c = b;

        System.out.println("int: " + a);
        System.out.println("Integer: " + b);
        System.out.println("Unboxing: " + c);

        boolean flag = true;
        Boolean flagObject = flag;

        boolean flag2 = flagObject;

        System.out.println("boolean: " + flag);
        System.out.println("Boolean: " + flagObject);
        System.out.println("Unboxing: " + flag2);

        long bigNumber = 10000000000L;
        Long bigNumberObject = bigNumber;

        long bigNumber2 = bigNumberObject;

        System.out.println("long: " + bigNumber);
        System.out.println("Long: " + bigNumberObject);
        System.out.println("Unboxing: " + bigNumber2);

        Integer nullNumber = null;

        try {
            int result = nullNumber;
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Integer равен null!");
        }
    }
}