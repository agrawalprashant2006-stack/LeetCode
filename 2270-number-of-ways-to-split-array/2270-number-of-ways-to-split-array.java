class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        long sum1 = 0;
        int c = 0;
        for(int i =0; i<nums.length; i++){
            sum+=nums[i];
        }
        for(int j = nums.length-1; j>0; j--){
                sum1+=nums[j];
                if(sum-sum1>=sum1){
                    c++;
                }
            }
        return c;
    }
}