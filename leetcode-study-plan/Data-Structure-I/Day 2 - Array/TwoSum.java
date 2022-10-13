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
