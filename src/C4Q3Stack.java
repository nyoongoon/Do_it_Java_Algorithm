public class C4Q3Stack {
    public class IntStack {
        private int max;
        private int ptrA = 0;
        private int ptrB = max-1;
        private int[] stk;

        //생성자
        public IntStack(int capacity) {
            max = capacity;
            try {
                stk = new int[max]; // 스택 본체용 배열 생성
            } catch (OutOfMemoryError e) { //생성할 수 없음
                max = 0;
            }
        }
    }
}
