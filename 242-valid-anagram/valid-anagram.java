class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> h1=new HashMap<>();
        HashMap<Character, Integer> h2=new HashMap<>();

        for(char ch:s.toCharArray()){
            if(!h1.containsKey(ch)){
                h1.put(ch, 1);
            }
            else{
                h1.put(ch, h1.get(ch)+1);
            }
        
         }

          for(char ch:t.toCharArray()){
            if(!h2.containsKey(ch)){
                h2.put(ch, 1);
            }
            else{
                h2.put(ch, h2.get(ch)+1);
            }
        
         }

        return h1.equals(h2);
        
    }
}