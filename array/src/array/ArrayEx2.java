package array;

public class ArrayEx2 {
    public static void main(String[] args) {
        int jumsu[] = { 88, 78, 69, 55, 45, 66, 78, 72, 53, 22 };

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("학생 %d번의 수학점수 %d\n", (i + 1), jumsu[i]);
            sum += jumsu[i];
        }
        System.out.printf("점수 총합 %d, 평균 %d", sum, sum / jumsu.length);

    }
}
