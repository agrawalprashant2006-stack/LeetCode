class Solution {
    public int maxSubarraySumCircular(int[] nums) {
     int ans =  Maximum_Circular_Subarray_Sum(nums);
     return ans;  
    }
    public static int kadanesAlgorithm(int nums[]){
        int sum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
                sum+=nums[i];
                MaxSum = Math.max(MaxSum,sum);
                if(sum<0){
                    sum = 0;
            }
        }
        return MaxSum;
    }

    public static int Maximum_Circular_Subarray_Sum(int nums[]){
        int linearSum = kadanesAlgorithm(nums);
        int totalSum = 0;
        for(int i = 0; i<nums.length; i++){
            totalSum += nums[i];
            nums[i] = nums[i]*(-1);
        }
        int middleSum = kadanesAlgorithm(nums);
        int CircularSum = totalSum + middleSum;
         if(linearSum<0){
            return linearSum;
         }
         return Math.max(linearSum,CircularSum);
    }
}