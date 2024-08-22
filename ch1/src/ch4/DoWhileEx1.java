package ch4;

import ch3.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // for, while과 다른 점은 {}을 수행한 후 조건식을 검사
        // 최소 1번은 실행된다 (for, while은 조건에 안맞으면 아예 실행이 되지 않음)

        // 1~100 사이의 임의의 숫자를 추출한 후 해당 숫자 알아맞추기

        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;

        do {
            System.out.print("1~100 사이의 숫자 입력 >>");
            input = sc.nextInt();

            if (answer < input) {
                System.out.println("더 작은 수를 입력해주세요");
            } else {
                System.out.println("더 큰 수를 입력해주세요");
            }
        } while (answer != input);

        System.out.println("정답입니다!! 프로그램 종료");

        sc.close();
    }
}
