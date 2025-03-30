//Problem link :https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev=0;
        int original = n;
        if(n==0){
            return rev;
        }
        
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        
        return (int)Math.pow(original,rev);
    }
}
