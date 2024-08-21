package ch2;

public class OperEx2 {
    public static void main(String[] args) {
        // 단항연산자
        // 1) 부호 연산자 : - +
        // 2) 증감 연산자 : -- ++
        // -- ++ 앞쪽에 오는 경우는 연산이 먼저 실행되고 대입이 됨
        // -- ++ 뒤쪽에 오는 경우는 대입이 먼저 되고, 나중에 실행이 된다
        // 3) 논리 부정 연산자 : !
        // true, false 와 함께 사용

        int x = 10;
        // x = x+1 을 자바에서는 간단하게 아래와 같이 표현한다
        // ++x; 이나 x++; 이나 바로 아래줄 계산할때는 별 문제 없음
        // System.out.println("x =" + x);
        // 그러나..
        // System.out.println("x =" + (++x)); 11
        // System.out.println("x =" + (x++)); 10
        // 의 경우는 계산이 달라짐 why?
        // -- ++ 앞쪽에 오는 경우는 연산이 먼저 실행되고 대입이 됨
        // -- ++ 뒤쪽에 오는 경우는 대입이 먼저 되고, 나중에 실행이 된다

        // x--;
        // System.out.println("x =" + x);
        // System.out.println("x =" + (--x)); 10

        boolean paly = true;
        System.out.println(!paly);

    }
}
