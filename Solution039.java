class Solution039 {
    List<List<Integer>> ret;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ret = new ArrayList<List<Integer>>();
        if(candidates.length == 0) return ret;
        dfs(candidates, target, new ArrayList<Integer>(), 0, 0);
        return ret;
    }

    public void dfs(int[] candidates, int target, ArrayList<Integer> temp, int first, int sum){
        if(sum > target) return;
        if(sum == target){
            ret.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i = first; i < candidates.length; i++){
            temp.add(candidates[i]);
            dfs(candidates, target, temp, i, sum + candidates[i]);
            temp.remove(temp.size() - 1);
        }
    }
}