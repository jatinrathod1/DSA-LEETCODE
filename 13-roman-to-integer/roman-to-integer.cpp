class Solution {
public:
    int getVal1(char ch) {
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    
    int romanToInt(std::string s) {
        int n = s.length();
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            int ch1 = getVal1(s[i]);
            if (i + 1 < n && ch1 < getVal1(s[i + 1])) {
                sum -= ch1;
            } else {
                sum += ch1;
            }
        }
        
        return sum;
    }
};
