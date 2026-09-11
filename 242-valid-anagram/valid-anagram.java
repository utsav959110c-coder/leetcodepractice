class Solution {
    public boolean isAnagram(String s, String t) {
        int [] freqOfS= new int[26];
        int [] freqOfT=new int[26];

        for(int i=0; i<s.length(); i++){
         int idx= s.charAt(i)-'a';
             freqOfS[idx]++;
        }

        for(int i=0; i<t.length(); i++){
            int idx= t.charAt(i)-'a';
            freqOfT[idx]++;
        }

        for(int i=0; i<26; i++ ){
            if(freqOfS[i]!=freqOfT[i]){
                return false;
            } 
        }
        return true;

    }
}