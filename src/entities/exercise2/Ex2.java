package entities.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex2 {
    public static List<Integer> randomList(int n) {
        Random rand = new Random();
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            num.add(rand.nextInt(101));
        }
        return num;
    }

    public static List<Integer> mirrorList(List<Integer> list) {
        List<Integer> mirrorList = new ArrayList<>(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            mirrorList.add(list.get(i));
        }
        return mirrorList;
    }

    public static void printList(List<Integer> list, boolean even) {
        for (int i = 0; i < list.size(); i++) {
            if (even && i % 2 == 0) {
                System.out.print(list.get(i) + " ");
            }
            if (!even && i % 2 != 0) {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
    }
}
