
        class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;

        // Calculate sum of first k elements
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        // Sliding window
        for(int i = k; i < nums.length; i++) {

            sum += nums[i];       // Add new element
            sum -= nums[i-k];     // Remove previous element

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }
}
      