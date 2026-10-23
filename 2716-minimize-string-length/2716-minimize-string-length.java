class Solution {
    public int minimizedStringLength(String s) {
        int c = 0;
        for(int i = 0; i<s.length(); i++){
             boolean found = false;
            for(int j = 0; j<i; j++){
            if(s.charAt(i) == s.charAt(j)){
                found = true;
                break;
            }
            }
            if(found == false)
            c++;
        }
        return c;
    }
}