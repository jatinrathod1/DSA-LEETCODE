class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character, Integer> mp = new HashMap<>();
        // map ma value nakhavani
        for (char c : m.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        //have r na badha char m ma check karavani
        for(int i=0; i<r.length(); i++){
            char c = r.charAt(i);
            if(!mp.containsKey(c) || mp.get(c) == 0 ){
                return false;
            }
            mp.put(c,mp.get(c)-1);
        } 
        return true;
    }
}