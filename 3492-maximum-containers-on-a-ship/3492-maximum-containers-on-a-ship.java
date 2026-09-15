class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int c = 0;
        int totalWeight = 0;
        for(int i = 1; i<=n*n; i++){
           totalWeight+=w;
           if(totalWeight<=maxWeight){
           c++;
           }else{
            break;
           }
        }
        return c;
    }
}