package ch3;

public class SwitchEx2 {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수회원");
                break;
            case 'B':
            case 'b':
                System.out.println("일반회원");
                break;
            case 'C':
            case 'c':
                System.out.println("손님");
                break;
            default:
                break;
        }

        if (grade == 'A' || grade == 'a') {
            System.out.println("우수회원");
        } else if (grade == 'B' || grade == 'b') {
            System.out.println("일반회원");
        } else if (grade == 'C' || grade == 'c') {
            System.out.println("손님");
        }

    }
}
