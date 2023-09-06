// 1207. Unique Number of Occurrences
// Easy
// 4.1K
// 97
// Companies
// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 

// Example 1:

// Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
// Example 2:

// Input: arr = [1,2]
// Output: false
// Example 3:

// Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
// Output: true


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] ca = new int[2001];
        for(int i : arr) {
            ca[i+1000]++;
        }
        Arrays.sort(ca);
        for(int i=0; i<2000; i++) {
            if(ca[i] != 0 && ca[i] == ca[i+1]){
                return false;
            }
        }
        return true;
    }
}
