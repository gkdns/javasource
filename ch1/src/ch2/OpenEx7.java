package ch2;

public class OpenEx7 {
    public static void main(String[] args) {
        // 복합대입연산자
        int result = 10;

        // result = result +10;는 result가 중복되니까 간단하게 아래와 같이 쓰며 복합대입연산자라 함
        result += 10;
        System.out.println("result =" + result);

        result -= 5;
        System.out.println("result =" + result);

        result *= 3;
        System.out.println("result =" + result);

        result /= 3;
        System.out.println("result =" + result);

        // 삼향연산자
        // 조건식 ? 식1 :식2;
        int score = 85;
        // score가 90이상이면 A, 아니면 B 출력
        char ch2 = score >= 90 ? 'A' : 'B';
        System.out.println("학점 : " + ch2);

        // score가 90이상이면 A, 80이상이면 B, 나머지는 C
        // 조건식1 ? 식1 : (조건식2) ? 식1 : 식2;
        char ch3 = score >= 90 ? 'A' : score >= 80 ? 'B' : 'C';
        System.out.println("학점 : " + ch2);

    }
}
