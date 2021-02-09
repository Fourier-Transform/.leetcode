class Solution005 {
    public String longestPalindrome(String s) {
        String ret = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int l = 0; l < s.length(); l++){
            for(int i = 0; i + l < s.length(); i++){
                int j = i + l;
                if(l == 0) dp[i][j] = true;
                else if(l == 1) dp[i][j] = (s.charAt(i) == s.charAt(j));
                else{
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]);
                }
                if(dp[i][j] && j-i+1 > ret.length()){
                    ret = s.substring(i, j + 1);
                }
            }
        }
        return ret;
    }
}