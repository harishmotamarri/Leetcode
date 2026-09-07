class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int stable = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int j = 0; j <= i; j++) {
                max = Math.max(nums[j], max);
            }

            for (int j = i; j < nums.length; j++) {
                min = Math.min(nums[j], min);
            }

            int instable = max - min;

            if (instable <= k) {
                stable = i;
                break;   // first stable index
            }
        }

        return stable == Integer.MAX_VALUE ? -1 : stable;
    }
}