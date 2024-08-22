package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        int jumsu[] = { 88, 78, 69, 55, 45, 66, 78, 72, 53, 22 };
        int jumsu2[] = new int[15];
        for (int i = 0; i < jumsu.length; i++) {
            jumsu2[i] = jumsu[i];
        }

        Scanner sc = new Scanner(System.in);

        Object sc;
        for (int i = 0; i < jumsu.length; i++) {
            System.out.printf("%d 번 학생 점수 입력", i);
            jumsu2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(jumsu2));

        sc.close();
    }
}
