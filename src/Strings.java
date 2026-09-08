public class Strings {

    public static void main(String[] args) {

        String text = "Java is great Java";

        String replaced = text.replace("Java", "Python");
        System.out.println("Замена: " + replaced);

        String textWithSpaces = "   Hello Java   ";

        String trimmed = textWithSpaces.trim();
        System.out.println("Обрезка: " + trimmed);

        String[] words = trimmed.split(" ");

        System.out.println("Разбиение:");

        for (String word : words) {
            System.out.println(word);
        }

        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "java";

        System.out.println("\nСравнение строк:");

        System.out.println("==: " + (s1 == s2));
        System.out.println("equals: " + s1.equals(s2));
        System.out.println("equalsIgnoreCase: "
                + s1.equalsIgnoreCase(s3));

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");

        System.out.println("\nStringBuilder:");
        System.out.println("После конкатенации: " + sb);

        sb.delete(5, sb.length());

        System.out.println("После обрезки: " + sb);
    }
}