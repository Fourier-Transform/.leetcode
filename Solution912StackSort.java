class Solution912StackSort {
    public int[] sortArray(int[] nums) {
        heapBuild(nums);
        for(int i = nums.length - 1; i > 0; i--){
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapSwap(nums, 0, i - 1);
        }
        return nums;
    }

    public void heapSwap(int[] nums, int root, int upperBound){
        int maxChildIndex = -1;
        for(int i = root; i <= upperBound; i = maxChildIndex){
            if((i*2 + 2) <= upperBound){
                maxChildIndex = nums[i*2 + 2] > nums[i*2 + 1] ? i*2 + 2: i*2 + 1;
            }else if((i*2 + 1) <= upperBound){
                maxChildIndex = i*2 + 1;
            }else {
                break;
            }
            if(nums[maxChildIndex] > nums[i]){
                int temp = nums[maxChildIndex];
                nums[maxChildIndex] = nums[i];
                nums[i] = temp;
            }else{
                break;
            }
        }
    }

    public void heapBuild(int[] nums){
        for(int i = nums.length - 1; i >= 0; i--){
            heapSwap(nums, i, nums.length - 1);
        }
    }
}