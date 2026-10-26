class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int occurence=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                occurence++;
                if(occurence>count){
                    count=occurence;
                }
            }
            else{
                occurence=0;
            }
            
        }
        return count;
    }
}