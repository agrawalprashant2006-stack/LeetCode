class Solution {
    public boolean search(int[] nums, int target) {
        if(Search(nums,target)){
            return true;
        }
        return false;
    }
    public static boolean Search(int arr[], int target){
        int hi = arr.length-1;
        int lo = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                return true;
            }

            if(arr[lo] == arr[mid] && arr[mid] == arr[hi]){
                lo++;
                hi--;
                continue;
            }
            
            //mid upper line se hai
            if(arr[mid]>=arr[lo]){
                 if(arr[lo]<=target && arr[mid]>target){
                    hi=mid-1;
                 }else{
                    lo = mid+1;
                 }
            }
            else{ //mid lower line pe hu
              if(arr[mid]<target && arr[hi]>=target){
                lo = mid+1;
              }else{
                hi = mid-1;
              }
            }
        }
        return false;
    }
}