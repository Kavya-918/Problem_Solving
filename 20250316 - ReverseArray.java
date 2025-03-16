//Problem link : https://www.geeksforgeeks.org/problems/reverse-an-array/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card


Logic 1: using 2 pointer approach

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
        // 2 pointer approach
      //index based swapping not on elements
      // left =0 and right=3(number of elements in an array)
        int left =0, right = arr.length-1;
        
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
}



Logic 2: Normal loop

  public class Reverse {

    public static void main(String[] args) {
        int[] arr = {3,6,1,9};
//i>0 when you put it skip 3 to print so i>=0
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]+" ");
        }
    }   
}








