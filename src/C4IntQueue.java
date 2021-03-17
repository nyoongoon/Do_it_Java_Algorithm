public class C4IntQueue {
    //프런트에서 리어 쪽으로 선형검색을 수행. 스캔의 시작은 큐의 첫요소. 즉 프론트.
    public int indexOf(int x){
        for(int i = 0; i < num; i++){
            int idx = (i + front ) % max; // 인덱스 계산 주의하기.
            if(que[idx] == x){
                return idx;
            }
        }
        return -1;
    }
}
