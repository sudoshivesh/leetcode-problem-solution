/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
(you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 
Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
*/
class Solution {
  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }
    List<StringBuilder> list = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      list.add(new StringBuilder());
    }
    int idx = 0;
    boolean downDirection = false;
    for (char c : s.toCharArray()) {
      list.get(idx).append(c);
      if (idx == 0 || idx == numRows - 1) {
        downDirection = !downDirection;
      }
      idx += downDirection ? 1 : -1;
    }
    StringBuilder result = new StringBuilder();
    for (StringBuilder sb : list) {
      result.append(sb.toString());
    }
    return result.toString();
  }
}
