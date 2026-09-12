class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        int max = -1;
        for (int i = n - 1; i >= 0; i--) {
            newArr[i] = max;
             if (arr[i] > max) {
                max = arr[i];
            }
        }
        return newArr;
        
    }
    
}