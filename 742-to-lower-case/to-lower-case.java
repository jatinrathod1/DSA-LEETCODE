class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 65 && c <= 90) {
                c = (char) (c - 'A' + 'a');
            }
            ans.append(c);
        }
        return ans.toString();
    }
}