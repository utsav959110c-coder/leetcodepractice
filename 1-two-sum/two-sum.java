class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diff= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            diff.put(nums[i], i);
        }
        int[] ans= new int[2];
        for(int i=0; i<nums.length; i++){
            int f= target- nums[i];
            if(diff.containsKey(f) && diff.get(f)!=i){
                ans[0]=i;
                ans[1]=diff.get(f);
                return ans;
            }
        }
       return ans; 
    }
}