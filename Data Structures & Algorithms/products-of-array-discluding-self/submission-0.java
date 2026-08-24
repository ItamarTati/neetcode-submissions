class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];

        // 1. Fill left products
        results[0] = 1;
        for (int i = 1; i < n; i++) {
            results[i] = results[i - 1] * nums[i - 1];
        }

        // 2. Multiply right products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            results[i] = results[i] * right;
            right = right * nums[i]; // Update running product for next step left
        }

        return results;
    }
}