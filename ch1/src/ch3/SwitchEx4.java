package ch3;

import java.util.Scanner;

public class SwitchEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 피연산자 2개와 연산자 1개를 입력받기
        // 3 5 *
        // 입력받은 숫자와 연산자를 이용해서 연산 후 결과 출력
        // 3 * 5 = 15

        System.out.print("연산자(+,-,*,/,%) 입력 >> ");
        String op = sc.nextLine();

        System.out.print("피연산자 입력1 : ");
        int or1 = sc.nextInt();

        System.out.print("피연산자 입력2 : ");
        int or2 = sc.nextInt();

        int result = 0;

        switch (op) {
            case "+":
                result = or1 + or2;
                break;
            case "-":
                result = or1 - or2;
                break;
            case "*":
                result = or1 * or2;
                break;
            case "/":
                result = or1 / or2;
                break;
            case "%":
                result = or1 % or2;
                break;
        }

        System.out.printf("%d %s %d = %d\n", or1, op, or2, result);

        sc.close();

    }
}
