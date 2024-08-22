package ch4;

public class WhileEx1 {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.println("안녕하세요");
            i++;
        }

        // 1~100 합계
        int sum = 0;
        i = 1;
        while (i < 101) {
            sum = sum + i;
            i++;
        }
        System.out.println("1~100의 합 : " + sum);

    }
}
