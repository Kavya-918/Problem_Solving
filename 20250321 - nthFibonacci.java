
//Problem Solving : https://www.geeksforgeeks.org/problems/fibonacci-number-1605700704/1?page=5&category=Java&sortBy=submissions

public static int fibonacci(int n){
        
    //Write your code here to calculate
    //to calculate the nth fibonacci number
     if(n <= 1)
     return n;
     
     return fibonacci(n-1)+fibonacci(n-2);
        
}
