public class CommonSubstring {
    int longestCommonSubstring(String string1, String string2) {
        char[] m = string1.toCharArray();
        char[] n = string2.toCharArray();

        int[][] a = new int[m.length + 1][n.length + 1];
        int max = 0;

        for (int i = 1; i <= m.length; i++) {
            for (int j = 1; j <= n.length; j++) {
                if (m[i - 1] == n[j - 1]) {
                    a[i][j] = a[i - 1][j - 1] + 1;
                    max = Math.max(a[i][j], max);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        CommonSubstring cs = new CommonSubstring();
        String text1 = "abcde";
        String text2 = "cdefg";

        int result = cs.longestCommonSubstring(text1, text2);
        System.out.println("The length of the longest common substring is: " + result);

    }
}
