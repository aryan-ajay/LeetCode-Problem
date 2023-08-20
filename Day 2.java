Question - Greatest Common Divisor of Strings

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"




class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
    int gcd(int a, int b) {
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    }
}