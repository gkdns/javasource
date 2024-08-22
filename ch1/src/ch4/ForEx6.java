package ch4;

public class ForEx6 {
    public static void main(String[] args) {
        // 1~100까지 숫자 중 3의 배수만을 더하기(단 9의 배수는 제외)
        // 1~100까지 숫자 중 3의 배수와 5의 배수 더하기

        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 9 != 0) {
                sum += i;
            }

            System.out.println("합계 " + sum);
        }

        sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("3과 5의 배수 합 : " + sum);

    }
}
