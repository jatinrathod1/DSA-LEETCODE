class Solution {
    public boolean wordPattern(String p, String s) {
            // String s ne array ma convert karo
        String[] words=s.split("\\s+");
        // have p ni lenght() and words arr ni length same hovi joie
        if(p.length()!= words.length){
            return false;
        }
        //map banavo
        HashMap<Character,String> map=new HashMap<>();
        // have p par traverse karishu and map karavishu words arr sathe
        for (int i=0; i<p.length(); i++){
            char original=p.charAt(i);
            String replcement=words[i];
            if(!map.containsKey(original)){
                if (!map.containsValue(replcement)){
                    map.put(original,replcement);
                }else {
                    // menas origanal repeat nai thatu but 2 char same replacement ne map kkare che so it's not valid
                    return false;
                }
            } else {
                // origanal repeat thai che means have old origanal nu replacement new origanl na replacement sathe match thavu joie
                String oldOriganalReplacement=map.get(original);
                if(!Objects.equals(oldOriganalReplacement, replcement)){
                    return false;
                }
            }
        }
        return true; 
    }
}