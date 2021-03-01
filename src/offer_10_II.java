public class offer_10_II {

    /**
     * 青蛙跳台阶问题
     * 链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
     * @param n n 级台阶
     * @return 返回跳法
     */
    public int numWays(int n) {
        int[] memo = new int[101];
        memo[0] = 1;
        memo[1] = 1;
        memo[2] = 2;
        return Ways(memo, n);
    }

    public int Ways(int[] memo, int n) {
        if(memo[n] != 0) {
            return  memo[n];
        }
        memo[n] = (Ways(memo, n-1) + Ways(memo, n-2)) % 1000000007;
        return memo[n];
    }

    public int dpNumWays(int n) {
        int[] dp = new int[n+3];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1000_000_007;
        }
        return dp[n];
    }

}
