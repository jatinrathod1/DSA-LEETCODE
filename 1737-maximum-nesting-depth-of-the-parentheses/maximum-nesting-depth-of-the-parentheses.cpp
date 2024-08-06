class Solution {
public:
    int maxDepth(string s) {
        int max = 0, curr = 0;
        for (char ch : s) {
            if (ch == '(') {
                curr++;
                if (curr > max) {
                    max = curr;
                }
            } else if (ch == ')') {
                curr--;
            }
        }
        return max;
    }
};