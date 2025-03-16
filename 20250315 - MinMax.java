Problem link : https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

Logic 1:

//import javafx.util.Pair; 
public class MinMax {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7};
        //if i didnot declare method as static then create object for class and call
        // MinMax k = new MinMax();

        //I created so i can skip 
        Pair<Integer,Integer> result = getMinMax(arr);

        //printing
        System.out.println("Smallest: "+ result.getKey());
        System.out.println("Largest: " + result.getValue());

    }

    //Method
    public static Pair<Integer, Integer> getMinMax(int[] arr){
        // Initializing smallest with the largest possible integer value
        // so that any number in the array will be smaller than this.
        //you can also assign with Zero but some edge case fail if having -3 like that
        int smallest = Integer.MAX_VALUE; // 2147483647

        // Initializing largest with the smallest possible integer value
        // so that any number in the array will be larger than this.
        int largest = Integer.MIN_VALUE; // -2147483648

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
           if(arr[i] < smallest){
            smallest = arr[i];
           }
        }
        return new Pair<>(smallest,largest);
    }
    
}

//custom pair class
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}


Logic : 2

    
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of values you are going to enter here dudeee:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the list of value dudeeee:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] result = find(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }


    public static int[] find(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            else{
                smallest = arr[i];
            }
        }
        return new int[] {smallest,largest};
    }
}



Logic 3:

import java.util.*;
public class MinMax {
    public static void main(String[] args) {

        int[] arr = {4,2,1,9,9,1};
        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[arr.length-1]);
       
    } 
 }








