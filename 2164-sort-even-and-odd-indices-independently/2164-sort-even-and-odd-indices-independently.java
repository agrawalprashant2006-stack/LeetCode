class Solution {
    public int[] sortEvenOdd(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+2; j<nums.length; j+=2){
            if( i%2 == 0){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp; 
                }
            }
            else{
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp; 
                }
            }
        }
        }
        return nums;
    }
}