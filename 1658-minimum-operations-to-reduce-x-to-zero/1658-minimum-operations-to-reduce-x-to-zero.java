class Solution {
    public int minOperations(int[] nums, int x) {
       int total = 0;
       for(int i : nums){
        total+=i;
       }
       int left = 0;
       int right = nums.length-1;
       int len = -1;
       int sum = 0;
       int target = total-x;
       for(int i = 0; i<nums.length; i++){
        sum+=nums[i];
        while(left<=i && sum > target){
            sum-=nums[left];
            left++;
        }
        if(sum == target){
            len = Math.max(len, i-left+1);
        }
       }
       if(len == -1){
        return -1;
       }
       return nums.length-len;
    }
}