class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap< String, List<String>> h1= new HashMap<>();

        for(String str: strs){
            char[] sortedstr= str.toCharArray();
            Arrays.sort(sortedstr);
            String Key= new String(sortedstr);
           
            if(!h1.containsKey(Key)){
                List<String> value = new ArrayList<>();
                value.add(str);
                h1.put(Key, value);
            }
            else{
                List<String> value= h1.get(Key);
                value.add(str);
                h1.put(Key, value);
            }
        }
        List<List<String>> fnl= new ArrayList<>();
        for(List<String> ans: h1.values()){
            fnl.add(ans);

        }
        return fnl;
    
    }
}