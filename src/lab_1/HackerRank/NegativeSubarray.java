package lab_1.HackerRank;

import java.util.Scanner;

public class NegativeSubarray {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                sum += arr[j];

                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);

        in.close();
    }
}