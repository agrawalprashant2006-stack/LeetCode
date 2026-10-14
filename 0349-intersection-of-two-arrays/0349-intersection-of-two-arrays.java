class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // int result[]=new int[Math.min(nums1.length,nums2.length)];
        // int k=0;
    
            
        // for(int i=0; i<nums1.length; i++){
        //     boolean exists = false;
        //     for(int x=0; x<k; x++){
        //         if(result[x] == nums1[i]){
        //             exists = true;
        //             break;
        //         }
        //     }
        //     if(exists) continue;
        //     for(int j=0; j<nums2.length; j++){
        //         if(nums1[i]==nums2[j]){
        //             result[k]=nums1[i];
        //             k++;
        //             break;
        //         }
        //     }
        // }
    
        // int ans[]=new int[k];
        // for(int i=0; i<k; i++){
        //     ans[i]=result[i];
        // }
        // return ans;
     Arrays.sort(nums1);
     Arrays.sort(nums2);
     List<Integer> l = new ArrayList<>();
        int i = 0; 
        int j = 0;
while(i<nums1.length && j<nums2.length){
   if(nums1[i] == nums2[j] ){
    if(!l.contains(nums1[i])){
    l.add(nums1[i]);
    }
    i++;
    j++;
   }else if(nums1[i]<nums2[j]){
    i++;
   }else{
    j++;
   }
}
int ans[] = new int[l.size()];
for(int k = 0; k<ans.length; k++){
    ans[k] = l.get(k);
}
return ans;
    }
}