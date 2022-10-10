/* 1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int>res;
        vector<int>ans;
        for(int i=0;i<nums.size();i++)
        {
            int val=target-nums[i];
            if(res.find(val)!=res.end())
            {
                ans.push_back(i);
                ans.push_back(res.find(val)->second);
            }
            res.insert(pair<int,int>(nums[i],i));
        }
        return ans;   
    }
};
