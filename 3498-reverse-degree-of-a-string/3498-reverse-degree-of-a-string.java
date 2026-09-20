class Solution {
    public int reverseDegree(String s) {
        char ch[] = new char[26];
        char alph = 'a';
        for(int i = 25; i>=0; i--){
            ch[i] =  alph;
            alph++;
        }
   int sum = 0;
   for(int i = 1; i<=s.length(); i++){
    for(int j = 0; j<ch.length; j++){
        if(s.charAt(i-1) == ch[j]){
            sum+=i*(j+1);
        }
    }
   }
   return sum;
    }
}