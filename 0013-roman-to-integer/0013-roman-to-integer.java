class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == 'I'){
                if(s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X' ){
                sum -= 1;
            }
            else{
                sum +=1;
            }
            }
            else if(s.charAt(i) == 'V'){
                sum += 5;
            }
            else if(s.charAt(i) == 'X'){
                if(s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C' ){
                sum -= 10;
            }
            else{
                sum +=10;
            }
            }
            else if(s.charAt(i) == 'L'){
                sum += 50;
            }
            else if(s.charAt(i) == 'C'){
               if(s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M' ){
                sum -= 100;
            }
            else{
                sum +=100;
            }
            }
            else if(s.charAt(i) == 'D'){
                sum += 500;
            }
            else if(s.charAt(i) == 'M'){
                sum += 1000;
            }
        }
        char last = s.charAt(s.length()-1);

        if(last == 'I') sum += 1;
        else if(last == 'V') sum += 5;
        else if(last == 'X') sum += 10;
        else if(last == 'L') sum += 50;
        else if(last == 'C') sum += 100;
        else if(last == 'D') sum += 500;
        else if(last == 'M') sum += 1000;
        return sum;
    }
}