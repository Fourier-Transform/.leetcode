class Solution153 {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1, mid = (left + right)/2;
        if(nums[left] <= nums[right]) return nums[0];
        while(left < right){
            mid = (left + right)/2;
            if(nums[mid+1] < nums[mid]) return nums[mid + 1];
            if(nums[mid-1] > nums[mid]) return nums[mid];
            if(nums[0] > nums[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}