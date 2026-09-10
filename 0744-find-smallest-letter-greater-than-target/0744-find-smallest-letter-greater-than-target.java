class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char min=0;
        for(int i=0; i<letters.length; i++){
            if(letters[i]>target){
                if(min<letters[i]){
                    min=letters[i];
                }
                return min;
            }
        
        }
        return letters[0];
    }
}