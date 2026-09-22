class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<String>();
        ans.add(words[0]);
        for(int i = 1; i<words.length; i++){
              if(!isAnagram(words[i-1],words[i])){
                ans.add(words[i]);
            }
        }
        return ans;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i<a.length; i++){
            if(a[i]!=b[i]){
                return false;

            }
        }
return true;
    }
}