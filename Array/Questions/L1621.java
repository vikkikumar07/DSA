package Array.Questions;

public class L1621 {

    public static int numberOfSets(int n, int k) {

        int MOD = 1_000_000_007;

        long[][] dp = new long[n][k + 1];
        long[][] open = new long[n][k + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {

                // Previous point tak ke ways
                dp[i][j] = dp[i - 1][j];

                // New segment start karna
                open[i][j] = (open[i - 1][j]
                        + dp[i - 1][j - 1]) % MOD;

                // Segment continue/end karna
                dp[i][j] = (dp[i][j] + open[i][j]) % MOD;
            }
        }

        return (int) dp[n - 1][k];
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 1;

        System.out.println(numberOfSets(n, k));
    }
}