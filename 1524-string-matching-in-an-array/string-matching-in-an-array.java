class Solution {
    public List<String> stringMatching(String[] words) {
          
       List<String> substring = new ArrayList();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i!=j && words[i].contains(words[j])){
                    if(!substring.contains(words[j])){ 
                        substring.add(words[j]);
                    }
                }
            }
        }
        return substring;
    }
}