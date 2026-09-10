class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = Product_Less_Than_k(nums, k);
       return ans;
    }
     public static int Product_Less_Than_k(int arr[], int k){
        int si = 0, ei = 0, p =1;
        int ans = 0;
        while(ei<arr.length){
            //window grow
            p*=arr[ei];
            //window shrink
            while(p>=k && si<=ei){
                p/=arr[si];
                si++;
            }
            //ans calculate
            ans +=(ei-si+1);
            ei++;
        }
        return ans;
    }
}