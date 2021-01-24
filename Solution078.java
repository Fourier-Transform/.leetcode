class Solution078 {
    ArrayList<List<Integer>> ret;
    public List<List<Integer>> subsets(int[] nums) {
        ret = new ArrayList<List<Integer>>();
        ret.add(new ArrayList<Integer>());
        if(nums.length == 0) return ret;
        dfs(nums, new ArrayList<Integer>(), 0);
        return ret;
    }

    void dfs(int[] nums, ArrayList<Integer> temp, int first){
        if(temp.size() == nums.length){
            return;
        }
        for(int i = first; i < nums.length; i++){
            temp.add(nums[i]);
            ret.add(new ArrayList<Integer>(temp));
            dfs(nums, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}