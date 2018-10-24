/*Write a function that takes a string as input and returns the string reversed.

Example 1:

Input: "hello"
Output: "olleh"
Example 2:

Input: "A man, a plan, a canal: Panama"
Output: "amanaP :lanac a ,nalp a ,nam A"
*/

class Solution {
    public String reverseString(String s) {
        int len = s.length();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++){
            reversed[i] = s.charAt(len - 1 - i);
        }
        return new String(reversed);
    }
}
