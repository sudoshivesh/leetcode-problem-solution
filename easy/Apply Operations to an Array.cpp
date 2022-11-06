//Apply Operations to an array
//This question has been asked in leetcode contest and  I have given its solution in C++
class Solution {
public:
    vector<int> applyOperations(vector<int>& nums) {
        for(int i=0; i<nums.size()-1;i++) {
            if(nums[i]==nums[i+1]) {
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        vector<int> num;
        int count = 0;
        for(int i=0; i<nums.size();i++) {
            if(nums[i] != 0) {
                num.push_back(nums[i]);
                count++;
            }
        }
        for(int i=0; i<nums.size()-count; i++) {
            num.push_back(0);
        }
        return num;
    }
};
