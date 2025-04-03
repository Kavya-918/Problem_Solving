//Problem Link : https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;

        // Bubble Sort Approach 
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if elements are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Now return the k-th smallest element
        return arr[k - 1];
    }
}
