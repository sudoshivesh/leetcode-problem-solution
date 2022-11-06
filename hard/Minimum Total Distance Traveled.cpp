//2463. Minimum Total Distance Traveled
class Solution {
public:
    typedef long long ll; 
    int n, m;
    vector<vector<int>>factories;
    vector<int>robots;
    vector<vector<vector<ll>>>dp;

    ll findAns(int i, int j, int k){
        if(i == n)
            return 0;
        if(j == m)
            return 1e18;
        if(dp[i][j][k] != -1e18)
            return dp[i][j][k];
        ll val1 = findAns(i, j+1, 0);
        ll val2 = 1e18;
        if(k < factories[j][1]){
            val2 = abs(factories[j][0] - robots[i]) + findAns(i+1, j, k+1);
        }
        return dp[i][j][k] = min(val1, val2);
    }
    
    long long minimumTotalDistance(vector<int>& robot, vector<vector<int>>& factory) {
        robots = robot;
        factories = factory;
        n =  robot.size();
        m = factory.size();
        dp.assign(n, vector<vector<ll>>(m, vector<ll>(n, -1e18)));
        sort(robots.begin(), robots.end());
        sort(factories.begin(), factories.end());
        return findAns(0, 0, 0);
    }
};
