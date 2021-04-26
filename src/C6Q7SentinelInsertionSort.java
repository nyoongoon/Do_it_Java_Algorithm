public class C6Q7SentinelInsertionSort {

    // 단순삽입정렬(보초법：배열의 머리요소는 비어있습니다.)
    static void insertionSort(int[] a, int n) {
        for (int i = 2; i < n; i++) {   //보초
            int tmp = a[0] = a[i];
            int j = i;
            for (; a[j - 1] > tmp; j--) {   //보초법 덕분에 j>0 조건을 제거했다.
                a[j] = a[j - 1];
            }
            if (j > 0) {
                a[j] = tmp;
            }
        }
    }
}
