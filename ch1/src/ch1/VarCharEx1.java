package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        // 문자: 무조건 ''로 처리! ("" 혹은 'sd'와 같이 두문자도 안됨)
        char ch1 = 'c';
        char ch2 = 65;
        // 문자를 코드값으로 변경한 후 처리
        // 문자 표현방식 (아스키코드, 유니코드<-인터넷에서 주로 사용되는 인코딩 방식)
        // a: 97, A: 65
        System.out.println("ch1=" + ch1 + ", ch2=" + ch2);
        System.out.printf("ch1=%c, ch2=%c", ch1, ch2);
    }
}
