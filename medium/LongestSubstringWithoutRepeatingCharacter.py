'''
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
'''
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if s == "":
            return 0
        # Starting index of window
        start = 0
        # Ending index of window
        end = 0
        # Maximum length of substring without repeating characters
        maxLength = 0
        # Set to store unique characters
        unique_characters = set()
        # Loop for each character in the string
        while end < len(s):
            if s[end] not in unique_characters:
                unique_characters.add(s[end])
                end += 1
                maxLength = max(maxLength, len(unique_characters))
            else:
                unique_characters.remove(s[start])
                start += 1
        return maxLength
