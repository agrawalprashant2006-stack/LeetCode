class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        //prefix sum
        long prefix[] = new long[n];
        prefix[0] = nums[0];
        for(int i = 1; i<n; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        //suffix sum
        long suffix[] = new long[n];
        suffix[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--){
            suffix[i] = suffix[i+1]+nums[i];
        }
        int c = 0;
        for(int i = 0; i<n-1; i++){
            if(prefix[i] >= suffix[i+1]){
                c++;
            }
        }
       
return c;
    }
}