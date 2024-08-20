package ch1;

public class VarLongEx1 {
    public static void main(String[] args) {
        // L, l : 대소문자 둘다 가능. 하지만 소문자는 헷갈려서 거의 안씀.
        long value = 123456789L;

        value = 1000000000000L;

        System.out.println(value);
        // print() 메소드 안의 '+'의 의미는 '연결'이다 (무조건 연결이 아니고, ""랑 붙었을때만)
        System.out.println("value = " + value);
        // 아래의 경우 '+'는 산술연산이 된다
        System.out.println(value + value);
    }
}
