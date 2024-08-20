package ch1;

public class VarScopeEx1 {
    public static void main(String[] args) {
        // 로컬변수(지역변수, 변수) 유효범위
        // 변수를 선언한 블록내에서만 유효함

        int a = 25;
        int c;
        int d;

        {
            int b = 35;
            System.out.println(b);
            c = b + 50;
        }
        System.out.println(a);
        System.out.println(c);
        // 로컬 변수는 사용하기 전 반드시 초기화 해야 함 (System.out.println(d);)

    }
}
