public class C2Q4ArrayCopy {
    //배열을 복사할 때, 배열의 크기 비교!
    static void copy(int[] a, int[] b) {
        // b가 더 길거나 같으면 a의 길이만큼, a가 더 길면 b의 길이만
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++)
            a[i] = b[i];
    }
}
