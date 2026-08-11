class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int left =0;

        for(int right = 0; right<s2.length();right++){
            window.put(s2.charAt(right), window.getOrDefault(s2.charAt(right), 0)+1);
            if(right-left+1>s1.length()){
                window.put(s2.charAt(left), window.get(s2.charAt(left))-1);
                if (window.get(s2.charAt(left)) == 0) {
    window.remove(s2.charAt(left));
}
                left++;
            }
            if(window.equals(map)){
                return true;
            }
        }
        return false;
    }
}