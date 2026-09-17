class Solution {
    public String reverseVowels(String s) {
       String ans =  Reverse(s);
       return ans;
    }
    public static String Reverse(String s){
        char arr[] = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(!isVowel(arr[i])){
                i++;
            }else if(!isVowel(arr[j])){
                j--;
            }else{
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        } 
        }
        return new String(arr);
    }
    public static boolean isVowel(char ch){
       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
        return true;
       }
       return false;
    }
}