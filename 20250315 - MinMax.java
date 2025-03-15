Problem link : https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

Solution 1:

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
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

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








