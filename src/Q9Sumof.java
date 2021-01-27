public class Q9Sumof {
    public static void main(String[] args) {
        System.out.println("정수 a, b 포함하여 그 사이의 모든 정수의 합 = " + sumOf(3, 5));
    }

    /*
        static int sumOf(int a, int b) {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        }
     */
    static int sumOf(int a, int b) {
        //a와 b의 대소관계에 상관없이 합을 구해야함!!
        int max;
        int min;
        int sum = 0;
        if (a > b) {
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }
        for(int i = min; i<=max; i++){
            sum += i;
        }
        return sum;
    }

}
