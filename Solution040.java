class Solution040 {
    ArrayList<List<Integer>> ret;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ret = new ArrayList<List<Integer>>();
        if(candidates.length == 0) return ret;
        Arrays.sort(candidates);
        boolean[] used = new boolean[candidates.length];
        Arrays.fill(used, false);
        dfs(candidates, used, new ArrayList<Integer>(), 0, 0, target);
        return ret;
    }

    public void dfs(int[] candidates, boolean[] used, ArrayList<Integer> temp, int first, int sum, int target){
        if(sum > target) return;
        if(sum == target){
            ret.add(new ArrayList<Integer>(temp));
        }else{
            for(int i = first; i < candidates.length; i++){
                if(i > 0 && candidates[i - 1] == candidates[i] && used[i - 1] == false){
                    continue;
                } 
                temp.add(candidates[i]);
                used[i] = true;
                dfs(candidates, used, temp, i + 1, sum + candidates[i], target);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}