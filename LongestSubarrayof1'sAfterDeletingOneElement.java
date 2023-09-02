// Question - 1493. Longest Subarray of 1's After Deleting One Element
//   Given a binary array nums, you should delete one element from it.

// Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
// Example 1:

// Input: nums = [1,1,0,1]
// Output: 3
// Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
// Example 2:

// Input: nums = [0,1,1,1,0,1,1,0,1]
// Output: 5
// Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
// Example 3:

// Input: nums = [1,1,1]
// Output: 2
// Explanation: You must delete one element.

class Solution {
    public int longestSubarray(int[] nums) {
        int curr=0;
        int prev=0;
        int ans=0;
        for(int a : nums){
            if(a == 1){
                curr++;
            } else {
                ans = Math.max(ans, curr + prev);
                prev = curr;
                curr = 0;
            }
        }
        ans = Math.max(ans, curr+prev);
        return ans == nums.length ? ans-1:ans;
    }
}
