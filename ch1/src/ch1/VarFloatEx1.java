package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 타입 변수명 = 초기화값;
        // F 혹은 f 가능(실수는 double로 기본타입으로 인식하기 때문에 float를 인지시켜줘야 함)
        float score = 90.14F;

        // D 혹은 d 가능
        double score2 = 98.5D;
        score2 = 90d;

        System.out.println("score = " + score);
        System.out.println("score2 = " + score2);

        int value1 = 92;
        // 큰타입=작은타입 (double 8byte, int 4byte)
        double score3 = value1;
        System.out.println("score3 =" + score3);

    }
}
