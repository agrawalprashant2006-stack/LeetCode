class Solution {
    public int[] evenOddBit(int n) {
       int bin = DecToBin(n);
       int temp = bin;
       int c = 0;
       while(temp!=0){
        c++;
        temp/=10;
       }
     int arr[] = new int[c];
     int i =0;
        int d = 0;
        while(bin!=0){
         d = bin%10;
         arr[i] = d;
         i++;
        bin/=10;
     }
      int even = 0;
       int odd = 0;
       for(int j =0; j<c; j++){
        if(arr[j] == 1){
            if(j%2==0){
                even++;
            }else{
                odd++;
            }
        }
       }
       int ans[] = {even, odd};
       return ans;
    }

    public static int DecToBin(int n){
        int bin = 0;
        int pow = 0;
        while(n!=0){
            int d = n%2;
            bin += d*(int)Math.pow(10,pow);
            pow++;
            n /= 2;
        }
        return bin;
    }
}