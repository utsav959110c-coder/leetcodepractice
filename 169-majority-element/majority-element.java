class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        Arrays.sort(nums);
        int value=nums[0];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            else{
                count=1;
            }
                if(count>nums.length/2){
                    value=nums[i];
            
                }
            
        }
        return value;
    }
}