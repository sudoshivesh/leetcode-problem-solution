/* 1328. Break a Palindrome
Given a palindromic string of lowercase English letters palindrome, replace exactly one character with any lowercase English letter so that the resulting 
string is not a palindrome and that it is the lexicographically smallest one possible.
Return the resulting string. If there is no way to replace a character to make it not a palindrome, return an empty string.
A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, a has a character strictly smaller 
than the corresponding character in b. For example, "abcc" is lexicographically smaller than "abcd" because the first position they differ is at the fourth character, 
and 'c' is smaller than 'd'.

Example 1:

Input: palindrome = "abccba"
Output: "aaccba"
Explanation: There are many ways to make "abccba" not a palindrome, such as "zbccba", "aaccba", and "abacba".
Of all the ways, "aaccba" is the lexicographically smallest.
*/
class Solution {
  public String breakPalindrome(String palindrome) {
    if (palindrome.length() == 1) {
      return "";
    }
    for (int i = 0; i < palindrome.length(); i++) {
      if (palindrome.charAt(i) != 'a' && 
          (palindrome.length() % 2 == 0 || i != palindrome.length() / 2)) {
        return palindrome.substring(0, i) + "a" + palindrome.substring(i + 1);
      }
    }
    return palindrome.substring(0, palindrome.length() - 1) + "b";
  }
}
