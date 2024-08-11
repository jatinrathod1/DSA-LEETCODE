    class Solution {
    public String reverseWords(String s) {
        String a[] = s.split("\\s+");
        String rev ="";
        for (int i = a.length - 1; i >= 0; i--) {
            rev += a[i]+" ";
        }
        return rev.trim();
    }
};