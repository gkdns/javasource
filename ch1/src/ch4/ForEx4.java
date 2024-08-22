package ch4;

public class ForEx4 {
    public static void main(String[] args) {
        // 중첩 for
        // for 문 안에 또 다른 for 문 포함

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for문 동작 단계
        // 1) int i = 0; 실행
        // 2) i < 6; 실행
        // 3) for문 내부{} 로 진입
        // 4) int j = 0; 실행
        // 5) j < i; 실행
        // 6) 안쪽 for문{sout "*"} 실행
        // 7) j++; 이후 j < i;실행 => true라면 다시 안쪽 구문 실행
        // 8) 안쪽 실행 다 끝나면 false가 뜸. 그럼 안쪽 for문 종료
        // 9) 바깥 for문으로 가서 i++; => i < 6;라면 다시 안쪽 for문 실행
        // 10) 4) ~ 8) 계속 반복

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
