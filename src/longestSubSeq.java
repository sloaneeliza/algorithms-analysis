import java.util.Arrays;

public class longestSubSeq {
    public static int lcs(String string1, String string2) {
        int m = string1.length();
        int n = string2.length();
        int[][] a = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (string1.charAt(i - 1) == string2.charAt(j - 1)) {
                    a[i][j] = a[i - 1][j - 1] + 1;
                } else {
                    a[i][j] = Math.max(a[i - 1][j], a[i][j - 1]);
                }
            }
        }

        return a[m][n]; // Length of longest common subsequence
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        String text3 = "almanac";
        String text4 = "ferris";
        System.out.println("Length of Longest Common Subsequence: " + lcs(text1, text2));
        System.out.println("Length of Longest Common Subsequence: " + lcs(text3, text4));
    }
}
