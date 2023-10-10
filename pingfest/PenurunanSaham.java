package pingfest;

import java.util.Scanner;

public class PenurunanSaham {
    public static void penurunansaham(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int longestDecreasingSequence = findLongestDecreasingSequence(array);
        System.out.println(longestDecreasingSequence);

        scanner.close();
    }

    public static int findLongestDecreasingSequence(int[] array) {
        int longestSequence = 0;
        int currentSequence = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                currentSequence++;
            } else {
                longestSequence = Math.max(longestSequence, currentSequence);
                currentSequence = 1;
            }
        }

        return Math.max(longestSequence, currentSequence);
    }
}

