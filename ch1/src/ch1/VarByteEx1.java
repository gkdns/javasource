package ch1;

public class VarByteEx1 {
    public static void main(String[] args) {
        // 프로그램에서 구현할 부분을 코드로 작성
        // 제 나이는 25이고, 이름은 홍길동입니다. 출력
        // 변경되는 부분은 변수로 작성함
        // 변수는 선언 후 사용 : 타입 변수명 = 초기값;
        // 타입 : 정수형, 실수형, 문자형, 논리형
        // 1) 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
        // 2) 실수형 : float(4byte), double(8byte)
        // 3) 문자형 : char(2byte)
        // 4) 논리형 : boolean(1byte)
        // 주로 사용하는 타입은 int, double, char, boolean
        // 변수명 : 개발자가 정해서 넣으면 됨
        // 변수명 규칙 : 대소문자 구별, 예약어 사용불가, 숫자로 시작하면 안됨, 특수문자는 _와 $ 만 가능함
        // ,한국어 가능하지만 영어로 써라, 소문자로 시작한다
        // [ex) age, name, curPos 두개의 단어가 혼합된다면 뒷단어를 대문자로 시작]
        // 변수명을 보고 용도를 알게 해주는 것이 중요함

        // 변수 선언 후 초기화 작업한 것
        int age = 128;
        String name = "홍길동";

        // 초기화된 값을 변경하는 것
        age = 40;

        // print() : 화면출력/ println() : 화면출력+enter/ printf() : 포맷을 적용한 출력(enter는 포함x)
        // printf() : %d 정수형, %f 실수형, %c 문자형, %s 문자열형, %b 논리형
        // 자바는 문자와 문자열 다름 : 문자는 문자 하나('a'), 문자열은 문자 하나 혹은 여러개("abc" or "a")
        System.out.print("제 나이는 " + age + "이고, 이름은 " + name + "입니다.");
        System.out.println("제 나이는 " + age + "이고, 이름은 " + name + "입니다.");
        System.out.printf("제 나이는 %d이고, 이름은 %s입니다.", age, name);
        System.out.println("안녕하세요");
    }
}
