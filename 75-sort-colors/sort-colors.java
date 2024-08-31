class Solution {
    public void sortColors(int[] ar) {
        int n = ar.length;
        int c0 = 0, c1 = 0, c2 = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                c0++;
            }
            if (ar[i] == 1) {
                c1++;
            }
            if (ar[i] == 2) {
                c2++;
            }
        }
        System.out.println(c0);
        System.out.println(c1);
        System.out.println(c2);

        for (int i = 0; i < c0; i++) {
            ar[i] = 0;
        }
        for (int i = c0; i < c0 + c1; i++) {
            ar[i] = 1;
        }
        for (int i = c0 + c1; i < n; i++) {
            ar[i] = 2;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }
    }
}