package lab_1;

public class Loops {

    public static void main(String[] args) {

        System.out.println("Цикл for:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\nЦикл while:");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("\nЦикл do...while:");

        i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        System.out.println("\ncontinue и break:");

        for (i = 1; i <= 10; i++) {

            if (i == 3) {
                continue;
            }

            if (i == 7) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("\nМногомерный массив:");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}