class Solution {
    public int[] singleNumber(int[] nums) {
         List<Integer> l = new ArrayList<Integer>();
        for(int i =0; i<nums.length; i++){
            int c = 0;
            for(int j = 0; j<nums.length; j++){
            if(nums[i] == nums[j]){
                c++;
            }
        }
        if(c == 1){
            l.add(nums[i]);
        }
        }
        int ans[] = new int[l.size()];
        for(int i = 0; i<ans.length; i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}