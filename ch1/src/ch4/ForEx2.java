package ch4;

public class ForEx2 {
    public static void main(String[] args) {
        // 1~100 합을 구하자

        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum = sum + i;
        }
        System.out.println("1~100의 합 : " + sum);

        sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("1~100 홀수 합 : " + sum);

    }
}
