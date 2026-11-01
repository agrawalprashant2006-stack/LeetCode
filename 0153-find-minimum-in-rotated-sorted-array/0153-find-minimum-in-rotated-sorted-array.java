class Solution {
    public int findMin(int[] nums) {
        // int min=Integer.MAX_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]<min){
        //         min=nums[i];
        //     }
        // }
        // return min;

        // int start = 0;
        // int end = nums.length-1;
        // int min = Integer.MAX_VALUE;
        // while(start<end){
        //     int mid = (start+end)/2;
        //     if(nums[i] == mid){
        //         min = mid;
        //         }else if(nums[i]<mid){
                    
        //         }
        // }

        int ans = min(nums);
        return ans;
    }

    public static int min(int nums[]){
      int i = 0;
      int j = nums.length-1;
      while(i<j){
        int k = (i+j)/2;
          if(nums[j] < nums[k]){
            i = k+1;
          }else{
            j = k; 
          }
      }
      return nums[i];
    }
}