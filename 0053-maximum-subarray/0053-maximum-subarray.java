class Solution {
    public int maxSubArray(int[] nums) {
        int sum =nums[0];
        int maxs = nums[0];
        for(int i=1;i<nums.length;i++){
            sum = Math.max(nums[i], sum + nums[i]);
            maxs = Math.max(sum, maxs);
        }
        return maxs;
    }
}