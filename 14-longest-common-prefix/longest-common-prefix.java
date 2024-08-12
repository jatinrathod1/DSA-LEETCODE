class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(s)) {
                // jo strs[i] s thi j start thatu hoi to s em nam nahitar s ne chhellethi nano
                // kro
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }
}