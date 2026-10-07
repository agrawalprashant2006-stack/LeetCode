class Solution {
    public int monotoneIncreasingDigits(int n) {
        int c = 0;
        int original = n;
        while(n!=0){
            c++;
            n/=10;
        }
        n=original;
        char arr[] = new char[c];
        for(int i =c-1; i>=0; i--){
            arr[i] = (char)('0'+n%10);
            n/=10;
        }
        for(int i = c-2; i>=0; i--){
            if(arr[i]>arr[i+1]){
                arr[i]--;
                for(int j = i+1; j<c; j++){
                  arr[j] = '9';
                }
                
            }
        }
        int ans = 0;
        for(int i = 0; i<c; i++){
            ans = ans*10+(arr[i]-'0');
        }
        return ans;
    }
}