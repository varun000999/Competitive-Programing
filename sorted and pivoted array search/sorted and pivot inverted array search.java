class Solution {
    public int bsearch(int low,int high,int target,int[] nums)
    {
        int mdle=low + (int)(high-low)/2;
        int finl=-1;
        if(target==nums[mdle])
        {
            return mdle;
        }
        else if(target<nums[mdle])
        {
            if(low!=mdle)
            {
                finl= bsearch(low,mdle,target,nums);
            }
        }
        else if(target>nums[mdle])
        {
            if(mdle!=high)
            {
                finl= bsearch(mdle+1,high,target,nums);
            }
            
        }
        return finl;
    }
    public int search(int[] nums, int target) {
        int x=-1;
        int status=0;
        if(nums.length==1)
        {
            x=nums[0]==target ? 0: -1;
            return x;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]<nums[i])
            {
                status=1;
                int l1=bsearch(0,i,target,nums);
                int l2=bsearch(i+1,nums.length-1,target,nums);
                if(l1==-1&&l2==-1)
                {
                    x= -1;
                }
                else
                {
                    x= Math.max(l1,l2);
                }
            }
        }
        if(status==0)
        {
           x=bsearch(0,nums.length-1,target,nums);
        }
        return x;
    }
}