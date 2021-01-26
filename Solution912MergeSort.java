class Solution912MergeSort {
    public int[] sortArray(int[] nums) {
        merge(nums, 0, nums.length - 1);
        return nums;
    }

    void merge(int[] nums, int l, int r){
        if(l >= r) return;
        int mid = l + (r - l)/2;
        merge(nums, l, mid);
        merge(nums, mid + 1, r);
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l, j = mid + 1;
        while(i <= mid && j <= r){
            if(nums[i] < nums[j]){
                temp.add(nums[i++]);
            }else{
                temp.add(nums[j++]);
            }
        }
        while(i <= mid) temp.add(nums[i++]);
        while(j <= r) temp.add(nums[j++]);
        for(int t: temp){
            nums[l++] = t;
        }
    }
}