class Solution {
    public int maxDepth(String s) {
        int p = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                p++;
            }
            if(s.charAt(i)==')'){
                
                p--;
            }
            max = Math.max(p,max);
        }
        return max;
    }
}