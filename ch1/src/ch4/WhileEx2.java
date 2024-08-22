package ch4;

public class WhileEx2 {
    public static void main(String[] args) {
        // 구구단 5단 출력

        int i = 0;
        while (i < 10) {
            System.out.printf("5 * %d = %2d\n", i, (5 * i));
            i++;
        }

        // 중첩 while

        i = 0;
        while (i < 3) {
            int j = 1;
            while (j < 11) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        int sum = 0;
        i = 0;
        while (true) {
            if (sum > 100) {
                break;
            }
            i++;
            sum += i;
        }
        System.out.println("i=" + i);
        System.out.println("sum=" + sum);

        for (int j = 0; j < 11; j++) {
            if (j % 3 == 0) {
                continue;
            }
        }
    }
}
