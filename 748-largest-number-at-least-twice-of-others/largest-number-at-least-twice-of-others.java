class Solution {
    public int dominantIndex(int[] nums) {

        int max = 0;
        int index = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[max]) {
                max = i;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(i != max && nums[max] < 2 * nums[i]) {
                return -1;
            }
        }

        return max;
    }
}