#1239. Maximum Length of a Concatenated String with Unique Characters
class Solution:
    def maxLength(self, arr: List[str]) -> int:
        uniques = ['']
        maxi = 0
        
        for word in arr:
            for idx in range(len(uniques)):
                temp = word + uniques[idx]
                
                if len(temp) == len(set(temp)):
                    uniques.append(temp)
                    maxi = max(maxi, len(temp))
        
        return maxi
