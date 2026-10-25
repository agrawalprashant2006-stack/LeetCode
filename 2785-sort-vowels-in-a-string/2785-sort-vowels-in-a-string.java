class Solution {
    public String sortVowels(String s) {
        char ans[] = s.toCharArray();
      List<Character> vowels = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(isVowel(ans[i])){
                vowels.add(ans[i]);
               }
            }
            Collections.sort(vowels);
            int k = 0;
            for(int i = 0; i<ans.length; i++){
                if(isVowel(ans[i])){
                    ans[i] = vowels.get(k);
                    k++;
                }
            }
        return new String(ans);
    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  ){
            return true;
        }
        return false;
    }
}