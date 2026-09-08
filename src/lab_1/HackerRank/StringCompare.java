package lab_1.HackerRank;

import java.util.Scanner;

public class StringCompare {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int k = scan.nextInt();

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {

            String current = s.substring(i, i + k);

            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);

        scan.close();
    }
}