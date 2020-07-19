class Solution {
    public int maxSubArray(int[] nums) {
        int max_till_now=nums[0];
        int have_to_add=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            int nd=nums[i];
            have_to_add=Math.max(nd,have_to_add+nd);
            max_till_now=Math.max(have_to_add,max_till_now);
        }
        
        return max_till_now;
    }
}