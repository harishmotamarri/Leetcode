class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int left = 0;
        int right = 0;
        for(int i=0;i<nums.length;i++){
            leftsum[i] = nums[i] + left;
            left+=nums[i];
            rightsum[nums.length-i-1] = nums[nums.length-i-1] + right;
            right+=nums[nums.length-i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(leftsum[i] == rightsum[i]){
                return i;
            }
        }
        return -1;
    }
}