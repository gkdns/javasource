package ch2;

public class OpenEx6 {
    public static void main(String[] args) {
        // 논리연산자 : &&(and) ||(or) !(not)
        // true && true, true || true => 결과가 true
        // true && false => 결과는 false, true || false => 결과는 true
        // and는 모든 조건이 true인 경우에만 true 가 나옴

        int value = 6;

        // value가 2의 배수 혹은 3의 배수인지 확인한 후 맞다면
        // 2 또는 3의 배수라고 출력하기
        System.out.println((value % 2 == 0) || (value % 3 == 0));
        System.out.println((value % 2 == 0) && (value % 3 == 0));

        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수");
        }

        char ch1 = 'A';
        System.out.println(ch1 >= 'A');
        System.out.println(ch1 <= 'Z');

        // ch1이 대문자라면 ch1은 대문자입니다 라고 출력하기
        if (ch1 >= 'A' && ch1 <= 'Z') {
            System.out.println("ch1은 대문자입니다");
        }

    }
}
