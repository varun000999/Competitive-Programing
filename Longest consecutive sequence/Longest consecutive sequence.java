class Solution {
    public int hasnext(int x,int count,Set<Integer> mxset)
    {
        if(mxset.contains(x+1))
        {
            count++;
            count=hasnext(x+1,count,mxset);
        }
          return count;
        
    }
    public int longestConsecutive(int[] nums) {
        int maxcount=0;
        Set<Integer> mxset=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            mxset.add(nums[i]);
        }
        for(int j=0;j<nums.length;j++)
        {
            int temp=1;
            temp=hasnext(nums[j],temp,mxset);
            if(temp>maxcount)
            {
                maxcount=temp;
                
            }
        }
        return maxcount;
    }
}