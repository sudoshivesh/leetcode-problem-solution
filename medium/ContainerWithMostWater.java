/* 11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
Example 2:

Input: height = [1,1]
Output: 1
*/
lass Solution {
  public int maxArea(int[] height) {
    int maximumArea = 0;
    int leftIdx = 0;
    int rightIdx = height.length - 1;
    while (leftIdx < rightIdx) {
      int maxHeight = Math.min(height[leftIdx], height[rightIdx]);
      int currArea = maxHeight * (rightIdx - leftIdx);
      maximumArea = Math.max(currArea, maximumArea);
      if (maxHeight == height[leftIdx]) {
        leftIdx++;
      } else {
        rightIdx--;
      }
    }
    return maximumArea;
  }
}
