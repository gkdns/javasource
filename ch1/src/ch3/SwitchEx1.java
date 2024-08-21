package ch3;

public class SwitchEx1 {
    public static void main(String[] args) {
        // swith : if ~ else if ~ else 대체

        // switch (char or String or int) {
        // case value:

        // break;

        // default:
        // break;
        // }

        int random = (int) (Math.random() * 6) + 1;

        // 아래 case 1의 의미는 random == 1을 함축한 것, deflaut는 else를 의미
        switch (random) {
            case 1:
                System.out.println("주사위 1이 나옴");
                break;
            case 2:
                System.out.println("주사위 2가 나옴");
                break;
            case 3:
                System.out.println("주사위 3이 나옴");
                break;
            case 4:
                System.out.println("주사위 4가 나옴");
                break;
            case 5:
                System.out.println("주사위 5가 나옴");
                break;
            default:
                System.out.println("주사위 6이 나옴");
                break;
        }

    }
}
