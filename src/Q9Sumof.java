public class Q9Sumof {
    public static void main(String[] args) {
        System.out.println("정수 a부터 b까지의 합 = " + sumOf(3, 5));
    }

    static int sumOf(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
