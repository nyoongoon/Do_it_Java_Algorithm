public class C4Q6Gqueue<E> { //제네릭 큐 클래스 작성
    // 실행할 때 예외：큐가 비어 있음
    public static class EmptyGqueueException extends RuntimeException {
        public EmptyGqueueException() {
        }
    }

    // 실행할 때 예외：큐가 가득 참
    public static class OverflowGqueueException extends RuntimeException {
        public OverflowGqueueException() {
        }
    }
    private int max;
    private int num;
    private int front;
    private int rear;
    private E[] que;

    //생성자
    public C4Q6Gqueue(int capacity){
        num = front = rear = 0;
        this.max = capacity;
        try {
            E[] que = (E[]) new Object[max]; // 주의) 제네릭 배열 클래스 큐 생성
        }catch(OutOfMemoryError e){
        }
    }

    public E enqueue(E x) throws OverflowGqueueException{
        if(num>=max){
            throw new OverflowGqueueException();
        }
        que[rear ++] = x;
        num ++;
        if(rear == max){
            rear = 0;
        }
        return x;
    }

    public E dequeue() throws EmptyGqueueException{
        if(num<=0){
            throw new EmptyGqueueException();
        }
        E x = que[front++];
        num --;
        if(front == max){
            front = 0;
        }
        return x;
    }
}
