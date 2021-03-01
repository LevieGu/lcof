public class offer_10_I {

    /**
     * 斐波那契数列
     * 链接：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
     * @param n 第 n 项
     * @return 需要的斐波那契数
     */
    public int fib(int n) {
        int fib0 = 0, fib1 = 1, temp = 0;
        for(int i=0; i<n; i++) {
            temp = (fib0 + fib1) % 1000000007;
            fib0 = fib1;
            fib1 = temp;
        }
        return fib0;
    }
}
