class Solution {
    public int singleNumber(int[] arr) {
        int xor = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}