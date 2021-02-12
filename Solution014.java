class Solution014 {
    public String longestCommonPrefix(String[] strs) {
        int index = -1;
        String ret = "";
        if(strs == null || strs.length == 0 || strs[0] == null || strs[0].length() == 0) return ret;
        while(true){
            if(index + 1 > strs[0].length() - 1) return strs[0].substring(0, index + 1);
            char temp = strs[0].charAt(index+1);
            for(int i = 0; i < strs.length; i++){
                if( index + 1 <= strs[i].length() - 1 && strs[i].charAt(index+1) == temp){
                    ;
                }
                else{
                    return strs[0].substring(0, index + 1);
                }
            }
            index++;
        }
}
}