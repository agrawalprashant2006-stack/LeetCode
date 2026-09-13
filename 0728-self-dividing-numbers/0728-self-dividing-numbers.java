class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i =left; i<=right; i++){
            boolean valid = true; 
            int temp = i;
            while(temp!=0){
                int d = temp%10;
                if( d == 0|| i%d != 0){
                    valid = false;
                    break;
                }
                temp/=10;
            }
            if(valid){
                ans.add(i);
            }
        }
        return ans;
    }
}