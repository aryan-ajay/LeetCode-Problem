Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105

  // method 1====================================================================================
  class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(!hm.containsKey(nums[i])) {
                hm.put(nums[i], i);
            } else {
                int pastIndx = hm.get(nums[i]);
                if(Math.abs(pastIndx - i) <= k) {
                    return true;
                } else {
                    hm.put(nums[i], i);
                }
            }
        }
        return false;
    }
}

// method 2 ========================================================================================

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                if(i-hm.get(nums[i]) <= k) {
                    return true;
                }
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}

// method 3 =========================================================================================
TC => O(N)
public static boolean check(int nums[], int k) {
        for(int i=0; i<nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] == nums[j] && j - i <= k) {
                    return true;
                }
            }
        }
        return false;
    }
