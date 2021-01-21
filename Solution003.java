class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        if(s == null){
            return 0;
        }
        if(s.length() == 0 || s.length() == 1){
            return s.length();
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);
        int i = 0, j = 1, length = 1;
        for(;j < s.length(); j++){
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i){
                length = Math.max(length, j - i);
                i = map.get(s.charAt(j)) + 1;
                map.put(s.charAt(j), j);
            }else{
                map.put(s.charAt(j), j);
                length = Math.max(length, j - i + 1);
            }
        }
        return length;
    }
}