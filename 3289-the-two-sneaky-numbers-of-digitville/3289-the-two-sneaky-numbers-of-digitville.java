class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        int ans[] = new int[2];
        for(int i = 0; i<nums.length; i++){
            int c = 0;
            for(int j = 0; j<nums.length; j++){
             if(nums[i] == nums[j]){
                c++;
             }
            }
            if(c == 2 &&(i == 0 || nums[i]!=nums[i-1])){
                ans[k] = nums[i];
                k++; 
            }
            if(k == 2){
                break;
            }
        }
        return ans;
    }
}