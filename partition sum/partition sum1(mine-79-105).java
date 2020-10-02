class Solution {
    public boolean canactpartition(List<Integer> temp,int sum,int target)
    {
        boolean status=false;
        for(int i=0;i<temp.size()&&status==false;i++)
        {
            int locl=sum+temp.get(i);
            if(locl==target)
            {
                status= true;
            }
            else if(locl<target){
                List<Integer> tempp=temp;
                tempp.remove(i);
                status=status||canactpartition(tempp,locl,target);
            }
        }
        return status;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            temp.add(nums[i]);
        }
        if(sum%2==1)
        {
            return false;
        }
        sum=sum/2;
        return canactpartition(temp,0,sum);
    }
}

/*
*======================================================================================================================================================================*failing test case id no. 79 leetcode
* it was [1,2,3,4,5,6,7]
* i inspected program many times but unable to catch bug :/
*======================================================================================================================================================================
*/