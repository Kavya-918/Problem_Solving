//Problem link: https://www.geeksforgeeks.org/problems/reverse-digit0316/1

//Logic: 1
class Solution
{
    public long reverse_digit(long n)
    {
        long rev = 0;
        while(n > 0)
        {
            long rem = n%10;
            rev = (rev * 10) + rem;
            n = n/10;
        }
        return rev;
    }
}

//Logic: 2
public class Reverse {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(reverseDigit(num, 0));
    }

    public static int reverseDigit(int num, int rev){
        if(num == 0){
            return rev;
        }
        return reverseDigit(num/10, rev*10 + num%10);
    }   
}
