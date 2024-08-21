package ch3;

import java.util.Scanner;

public class IfEx7 {
    public static void main(String[] args) {
        // 세 개의 숫자를 입력 받은 후 입력 받은 세개의 숫자 중 가장 작은 수 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Num1 : ");
        int Num1 = sc.nextInt();

        System.out.print("Input Num2 : ");
        int Num2 = sc.nextInt();

        System.out.print("Input Num3 : ");
        int Num3 = sc.nextInt();

        int min = Num1;

        if (min > Num2) {
            min = Num2;
        }

        if (min > Num3) {
            min = Num3;
        }
        System.out.println("제일 작은 수는 : " + min);

        System.out.print("Input Num4 : ");
        int Num4 = sc.nextInt();

        System.out.print("Input Num5 : ");
        int Num5 = sc.nextInt();

        System.out.print("Input Num6 : ");
        int Num6 = sc.nextInt();

        int max = Num6;

        if (max < Num4) {
            max = Num4;
        }

        if (max < Num5) {
            max = Num5;
        }
        System.out.println("제일 큰 수는 : " + max);

    }
}
