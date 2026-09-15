class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int n=nums.length;
        int[] temp= new int[n];
        for(int i=0; i<n; i++ ){
            if (nums[i]!=val){
            
            temp[count]=nums[i];
            count++;
            
            } 
        }
        
        for(int j=0; j<n; j++){
            nums[j]=temp[j];
        }
        return count;
        
    }
}