class Solution154 {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int low = 0, high = nums.length - 1, pivot = low + (high - low)/2;
        while(low < high){
            pivot = low + (high - low)/2;
            if(nums[pivot] > nums[high]){
                low = pivot + 1;
            }else if(nums[pivot] < nums[high]){
                high = pivot;
            }else{
                high--;
            }
        }
        return nums[low];
    }
}