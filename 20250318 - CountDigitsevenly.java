//Problem link : https://www.geeksforgeeks.org/problems/count-digits5716/1


public class Kavya {
    public static void main(String args[]){
        int n = 102;
        System.out.println(evenlyDivide(n));

    }


    public static int evenlyDivide(int n){
        int count =0;
        int original = n;
        /** why we use original number and store because if i use n as normally after removing
         * the last digit the n value be changed right
         * for comparision/ checking purpose i need to store in one variable and i check
         */
        while( n > 0){
            int k = n%10; // last digit extract
            /*why K!=0 to avoid division by zero error
            example task as 102 first iteration 102%2 ok 1 increment 
            then second iteration 102%0 which throws error so handle this we use K!=0*/
            if( k !=0 && original % k == 0){
                count++;
            }
            n /=10;
        }
        return count;

    }
    
}
