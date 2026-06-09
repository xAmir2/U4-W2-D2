package entities.exercise1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1 {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of words you would like to enter: ");
        int n = input.nextInt();
        input.nextLine();

        Set<String> differentWords = new HashSet<String>();
        Set<String> sameWords = new HashSet<String>();

        for (int i = 0; i < n; i++) {
            System.out.println("Word " + (i + 1) + ": ");
            String word = input.nextLine();

            if (!differentWords.add(word)) {
                sameWords.add(word);
            }
        }

        System.out.println("\nSame words:");
        System.out.println(sameWords);
        System.out.println("\nAmount of different words:");
        System.out.println(differentWords.size());
        System.out.println("\nDifferent words:");
        System.out.println(differentWords);
    }
}
