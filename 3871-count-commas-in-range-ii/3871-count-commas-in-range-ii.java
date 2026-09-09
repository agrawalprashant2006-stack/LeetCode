class Solution {
    public long countCommas(long n) {
        long countCommas = 0;
            if(n>=1000){
                countCommas+=(n-1000)+1;
            }
            if(n>=1000000){
                countCommas+=(n-1000000)+1;
            }
            if(n>=1000000000){
                countCommas+=(n-1000000000)+1;
            }
            if(n>=1000000000000L){
                countCommas+=(n-1000000000000L)+1;
            }
            if(n>=1000000000000000L){
                countCommas+=(n-1000000000000000L)+1;
            }
return countCommas;
    }
}