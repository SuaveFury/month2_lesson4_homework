import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
// Аль Маджали Ахмад, второй месяц андроида, группа с 4 по 6, домашнее задание 4 урока
public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("A1");
        A.add("A2");
        A.add("A3");
        A.add("A4");
        A.add("A5");

        for (int i = 0; i < 5; i++) {
            System.out.println(A.get(i));
        }

        ArrayList<String> B = new ArrayList<>();
        B.add("B1");
        B.add("B2");
        B.add("B3");
        B.add("B4");
        B.add("B5");

        Collections.reverse(B);

        ArrayList<String> C = new ArrayList<>();
        Integer x = 0;
        while (C.size() < A.size() + B.size()) {
            C.add(A.get(x));
            C.add(B.get(x));
            x++;
        }


        System.out.println(C);
        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(C);
    }
}