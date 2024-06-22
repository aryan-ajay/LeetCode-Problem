// 215. Kth Largest Element in an Array

Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

  Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104

  // code 
  /**
 * Ajay
 */
public class Ajay {
    public static int findKntLargest(int arr[], int k) {
        return quickSelect(arr, 0, arr.length-1, arr.length - k);
    }
    public static int quickSelect(int arr[], int si, int ei, int k) {
        if(si == ei) {
            return arr[si];
        }

        int pIdx = partition(arr, si, ei);

        if(k == pIdx) {
            return arr[k];
        } else if(k < pIdx) {
            return quickSelect(arr, si, pIdx-1, k);
        } else {
            return quickSelect(arr, pIdx+1, ei, k);
        }
    }
    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];
        int i = si;

        for(int j=si; j<ei; j++) {
            if(arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, ei);
        
        return i;
    }
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKntLargest(arr, k));
    }
}
