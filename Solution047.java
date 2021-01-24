class Solution047 {
    ArrayList<List<Integer>> ret;
    public List<List<Integer>> permuteUnique(int[] nums) {
        ret = new ArrayList<List<Integer>>();
        if(nums.length == 0) return ret;
        int[] used = new int[nums.length];
        int[] visited = new int[nums.length];
        Arrays.sort(nums);
        dfs(nums, visited, used, new ArrayList<Integer>());
        return ret;
    }

    void dfs(int[] nums, int[] visited, int[] used, ArrayList<Integer> temp){
        if(temp.size() == nums.length){
            ret.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if((visited[i] == 1) || (i > 0 && nums[i - 1] == nums[i] && used[i - 1] == 0)){
                continue;
            }
            temp.add(nums[i]);
            used[i] = 1;
            visited[i] = 1;
            dfs(nums, visited, used, temp);
            used[i] = 0;
            visited[i] = 0;
            temp.remove(temp.size() - 1);
        }
    }
}