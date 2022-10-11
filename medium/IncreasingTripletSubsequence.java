/* 334. INCREASING TRIPLET SUBSEQUENCE
Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. 
If no such indices exists, return false.

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
*/
class Solution {
  public boolean increasingTriplet(int[] nums) {
    int firstNum = Integer.MAX_VALUE;
    int secondNum = Integer.MAX_VALUE;
    for (int num : nums) {
      if (num <= firstNum) {
        firstNum = num;
      } else if (num <= secondNum) {
        secondNum = num;
      } else {
        return true;
      }
    }
    return false;
  }
}
