class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int left = 0;
        int right = 0;
        for(int i=0;i<nums.length;i++){
            leftsum[i] = nums[i] + left;
            left+=nums[i];
        }
        for(int i=nums.length - 1;i>=0;i--){
            rightsum[i] = nums[i] + right;
            right+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(leftsum[i] == rightsum[i]){
                return i;
            }
        }
        return -1;
    }
}