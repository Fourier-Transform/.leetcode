class Solution046 {
    List<List<Integer>> ret;
    public List<List<Integer>> permute(int[] nums) {
        ret = new ArrayList<List<Integer>>();
        if(nums.length == 0) return ret;
        int[] visited = new int[nums.length];
        dfs(nums, visited, new ArrayList<Integer>());
        return ret;
    }

    public void dfs(int[] nums, int[] visited, ArrayList<Integer> temp){
        if(temp.size() == nums.length){
            ret.add(new ArrayList(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i] == 1) continue;
            visited[i] = 1;
            temp.add(nums[i]);
            dfs(nums, visited, temp);
            temp.remove(temp.size() - 1);
            visited[i] = 0;
        }
        return;
    }
}