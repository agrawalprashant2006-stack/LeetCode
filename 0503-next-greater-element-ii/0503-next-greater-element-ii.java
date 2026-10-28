class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = -1;
            int j = i+1;
            if( j == nums.length){
                j = 0;
            }
            int c=0;
             while(c<nums.length-1){    
                if(nums[i]<nums[j]){
                   ans[i] = nums[j];
                   break;
                }
                j++;
                 if( j == nums.length){
                    j = 0;
                  }
                  c++;
             }
        }
        return ans;
    }
}