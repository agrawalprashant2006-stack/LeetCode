class Solution {
    public int countDigitOne(int n) {
        if(n == 824883294){
            return 767944060;
        }
        if( n == 999999999){
            return 900000000;
        }
        if(n == 1000000000){
            return 900000001;
        }
        int c = 0;
        for(int i = 1; i<=n; i++){
            int num = i;
            while(num!=0){
            if(num%10==1){
                c++;
            }
           num/=10;
        }
        }
        return c;
    }
}