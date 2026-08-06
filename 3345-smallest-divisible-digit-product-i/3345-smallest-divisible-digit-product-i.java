class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int product = 1;
            int temp = n;
            while(temp>0){
                int lastdigit = temp % 10;
                temp = temp /10;
                product = product * lastdigit;
            }
            if(product % t == 0){
                return n;
            }
            n++;
        }
    }
}