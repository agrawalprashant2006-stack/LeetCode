class Solution {
    public int largestAltitude(int[] gain) {
        int k = gain[0];
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(gain[0]);
        for(int i =1 ; i<gain.length; i++){
             k+=gain[i];
             list.add(k);
        }
        int max = 0;
        for(int i = 0; i<list.size(); i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
       }
       return max;
    }
}