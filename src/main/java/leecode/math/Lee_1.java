package leecode.math;

/**
 * @author jinwentao
 * @version 1.0.0
 * @ClassName Solution.java
 * @Description 求包含最大区间 爬虫法
 * @createTime 2021年02月19日 16:04:00
 */
public class Lee_1 {

    public static void longestOnes(int[] A, int K) {
        int length = A.length;
        int left = 0;
        int right = 0;
        int zeros = 0;
        int result = 0;
        while (right < length) {
            if (A[right] == 0) {
                zeros++;
            }
            while (zeros > K) {
                if (A[left++] == 0) {
                    zeros--;
                }
            }

            result = Math.max(result, right - left + 1);
            right++;
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1};
        longestOnes(ints, 0);
    }

}
