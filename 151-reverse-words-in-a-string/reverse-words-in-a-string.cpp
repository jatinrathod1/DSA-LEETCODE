class Solution {
public:
    string reverseWords(string s) {
      int i = s.length() - 1;
    string ans = "";

    while (i >= 0)
    {
        while (i >= 0 && s[i] == ' ')
            i--;
        int j = i;
        if (i < 0)
            break;
        while (i >= 0 && s[i] != ' ')
            i--;
        if (ans.empty())
        {
            ans = s.substr(i + 1, j - i);
        }
        else
        {
            ans = ans + " " + s.substr(i + 1, j - i);
        }
    }
    return ans;
    }
};