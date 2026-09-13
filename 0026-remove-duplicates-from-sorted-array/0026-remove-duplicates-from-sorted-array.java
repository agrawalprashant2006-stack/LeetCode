class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 1;
        int k = 1;
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
                if(nums[i]!=nums[i-1]){
                    nums[k]=nums[i];
                    c++;
                    k++;
                }
            }
        return c;
    }
}