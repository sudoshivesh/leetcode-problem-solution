/* PALINDROME NUMBER
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
 
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
*/
class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int reversedNum = 0;
    int xCopy = x;
    while (x > 0) {
      int rem = x % 10;
      reversedNum = reversedNum * 10 + rem;
      x /= 10;
    }
    return reversedNum == xCopy;
  }
}
