package lab_1.HackerRank;

import java.util.Scanner;

public class JavaLoops {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            int power = 1;

            for (int j = 0; j < n; j++) {

                sum += power * b;

                System.out.print(sum + " ");

                power *= 2;
            }

            System.out.println();
        }

        in.close();
    }
}