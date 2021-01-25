import java.util.Scanner;

public class Q8SumGauss {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int sum =0;

     /* 내가 푼 답
        if(n%2 == 0){
            // n이 짝수일 때
            sum = (1+n) * n/2;
            System.out.println("1부터 n까지의 합 : " + sum);
        }else{
            // n이 홀수 일 때
            sum = n + (1 + (n-1)) * (n-1)/2;
            System.out.println("1부터 n까지의 합 : " + sum);
        }

      */
        sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합
        System.out.println("1부터 n까지의 합 : " + sum);
    }


}
