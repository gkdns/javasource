package ch2;

import java.util.Scanner;

public class OpenEx4 {
    public static void main(String[] args) {
        // 사용자로부터 한달 월급을 입력 받은 후 월급을 10년간 저축한 금액은 얼마인가

        // 키보드에서 입력받을 준비
        Scanner sc = new Scanner(System.in);

        // 사용자가 어떤 값을 입력해야 하는지 알려주기
        System.out.print("한달 급여 입력 >> ");

        // 급여를 변수에 담은 상황
        int salary = sc.nextInt();

        // 저축금액 구하기
        int deposit = salary * 12 * 10;

        System.out.printf("한달 월급 : %d\n10년 저축금액 : %d", salary, deposit);

        // 키보드 입력 종료하겠음
        sc.close();

    }
}
