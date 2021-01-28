import java.util.Scanner;

public class Q11DigitsNo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int count = 0;

        while (n >= 1) {
            n = n / 10;
            count++;
        }
        System.out.println("그 수의 자리수는 " + count + "자리수 입니다.");
    }
}


