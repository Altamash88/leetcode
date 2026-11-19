class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=nums[0];      // 1
        for(i =0;i < nums.length-1;i++){
            // 2 == 1
                if(nums[i]==nums[i+1]){
                    return true;
                }
            
        }
        return false;
    }
}