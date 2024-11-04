class Solution {
    public String compressedString(String word) {
        int n =word.length();
        String an="";
        for(int i=0; i<n; i++){
            char ch = word.charAt(i);
            int c=1;
            i++;
            while((i<n) && ch == word.charAt(i) ){
                c++;
                i++;
            }
            while(c>9){
                an+='9';
                an+=ch;
                c=c-9;
            }
            an+=c;
            an+=ch;
            i--;
        }
    return an;
    }
}