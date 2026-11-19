class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=nums[0];
        for(i =1;i < nums.length;i++){
            
                if(nums[i]==nums[i-1]){
                    return true;
                }
            
        }
        return false;
    }
}