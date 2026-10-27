class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int b=0;
        int e=(s.length())-1;
        while(b<e){
            if(!Character.isLetterOrDigit(s.charAt(b))){
                b++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(e))){
                e--;
            }

            else if(s.charAt(b)!=s.charAt(e)){
                return false;
            }
            
            else {
                b++;
                e--;
            }
        
        }
        return true;

    }
}