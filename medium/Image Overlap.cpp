//835. Image Overlap
class Solution
{
	public:
		int largestOverlap(vector<vector < int>> &img1, vector< vector< int>> &img2) {
			const int n = img1.size();
			vector<pair<int, int>> vec_a;
			vector<pair<int, int>> vec_b;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (img1[i][j] == 1) {
						vec_a.push_back({ i, j });
					}

					if (img2[i][j] == 1) {
						vec_b.push_back({ i, j });
					}
				}
			}

			int ans = 0;
			map<pair<int, int>, int> mp;
			for (const auto[i1, j1] : vec_a) {
				for (const auto[i2, j2] : vec_b) {
					int cur = ++mp[{ i1 - i2, j1 - j2 }];
					ans = max(ans, cur);
				}
			}

			return ans;
		}
};
