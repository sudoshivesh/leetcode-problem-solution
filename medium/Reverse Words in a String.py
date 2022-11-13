#151. Reverse Words in a String
class Solution:
  def reverseWords(self, s: str) -> str:
    return ' '.join(reversed(s.split()))
