public class C4Q4Queue {
    public class IntAryQueue {
        private int max;    //큐 용량
        private int num;    //현재 데이터 수
        private int[] que;  //큐 본체

        public IntAryQueue(int x){
            max = x;
            num = 0;
            que = new int[max];
        }

        public void push(int x){
            que[num++] = x;
        }

        public int pop(){
            int result = que[0];
            for(int i = 0; i < num; i++){
                que[i] = que[i+1];
            }
            return result;
        }
    }

}
