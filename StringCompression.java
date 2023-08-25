// String Compression
// Example 1:

// Input: chars = ["a","a","b","b","c","c","c"]
// Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
// Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

  class Solution {
    public int compress(char[] chars) {
        int  n = chars.length;

        if(n==1) {
            return 1;
        }

        int i=0, j=0;
        while(i<n) {
            int count = 1;
            while(i<n-1 && chars[i] == chars[i+1]) {
                count++;
                i++;
            }
            chars[j++] = chars[i++];
            if(count > 1) {
                for(char c : String.valueOf(count).toCharArray()) {
                    chars[j++] = c;
                }
            }
        }
        return j;
    }
}
