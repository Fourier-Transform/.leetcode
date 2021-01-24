class Solution090 {
    ArrayList<List<Integer>> ret;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ret = new ArrayList<List<Integer>>();
        ret.add(new ArrayList<Integer>());
        if(nums.length == 0) return ret;
        Arrays.sort(nums);
        int[] used = new int[nums.length];
        dfs(nums, used, new ArrayList<Integer>(), 0);
        return ret;
    }

    public void dfs(int[] nums, int[] used, ArrayList<Integer> temp, int first){
        for(int i = first; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1] && used[i - 1] == 0) continue;
            temp.add(nums[i]);
            used[i] = 1;
            ret.add(new ArrayList<Integer>(temp));
            dfs(nums, used, temp, i + 1);
            used[i] = 0;
            temp.remove(temp.size() - 1);
        }
    }
}