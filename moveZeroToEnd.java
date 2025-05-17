Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

public static void moveZeroToEnd(int arr[]) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++; 
            }
        }

        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroToEnd(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
