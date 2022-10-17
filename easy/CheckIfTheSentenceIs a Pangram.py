#1832. Check if the sentence is a Pangram
class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        return len(set(sentence))==26
        
