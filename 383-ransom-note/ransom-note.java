class Solution {
    public boolean canConstruct(String r, String m) {
    HashMap<Character, Integer> map = new HashMap<>();
    //map ma value nakhi
    for (char c: m.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }
    // have r no darek char m na map che ke nai te check karie
        for (int i=0; i<r.length(); i++){
            char c= r.charAt(i);
            if(!map.containsKey(c) || map.get(c)==0){
                return false;
            }
            map.put(c,map.get(c)-1);
        }
        return true;
    }
}