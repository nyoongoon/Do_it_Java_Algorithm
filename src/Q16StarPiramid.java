import java.util.Scanner;

public class Q16StarPiramid {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        spira(n);
    }

    static void spira(int n){
        for(int i = 1; i<=n; i++){
            for(int k=n-i; k>=1; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=(i-1)*2+1; j++){
                System.out.print("*");
            }
            /* 뒷부분을 띄어쓰기 하지 않고 공백으로 두기
            for(int k=n-i; k>=1; k--){
                System.out.print(" ");
            }*/
            System.out.println();
        }
    }
}
