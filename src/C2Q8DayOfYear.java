public class C2Q8DayOfYear {
    static int dayOfYear(int y, int m, int d){
        int days = d;

        for(int i = 1; i< m; i++){
            days += mdays[isLeap(y)][i-1];
        }
        return days;
    }
    // 문제 : dayOfYear의 변수 i와 days없이 while 문 사용하여 메서드 구현.
    /*
    **내정답
       static int dayOfYear(int y, int m, int d){
        int count = 1;
        while(count < m){
            count++;
            d += mdays[isLeap(y)][m-1];
        }

       return d;
    }
    **답안예시
      static int dayOfYaer(int y, int m, int d){
       while(--m !=0){ //count 변수를 사용하지 않고 직접 계산!!!
       d += mdays[isLeap(y)][m - 1];
       }
       * return d;
    }
     */
}
