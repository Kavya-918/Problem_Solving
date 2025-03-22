//Problem link : https://www.geeksforgeeks.org/problems/count-digits-1606889545/1?page=2&category=Java&sortBy=submissions

public static int countDigits(int n) {

    // write your code here
    // return number of digits in n
    int count =0;
    while( n > 0){
        n = n/10;
        count ++;
    }
    return count;
}
