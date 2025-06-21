class Sub_array {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxsum = Math.max(maxsum, currentMax);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        Sub_array sol = new Sub_array();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = sol.maxSubArray(nums);
        System.out.println("Maximum subarray sum is: " + result);
    }
}
