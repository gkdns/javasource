package ch4;

import java.util.Scanner;

public class ForEx7 {
    public static void main(String[] args) {
        // 5!출력
        // 5 * 4 * 3 * 2 * 1

        int fact = 1;
        for (int i = 5; i > 0; i--) {
            fact *= i;
        }
        System.out.printf("5! = %d", fact);

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("factorial 구할 숫자 입력 >> ");

        int fact2 = sc.nextInt();

        for (int i = fact2; i > 0; i--) {
            fact2 *= i;
        }
        System.out.printf("%d! = %d", fact2, fact);

    }
}