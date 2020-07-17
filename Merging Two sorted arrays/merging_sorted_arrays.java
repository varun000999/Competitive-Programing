class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer_1=m-1;
        int pointer_2=n-1;
        int pointer_3=m+n-1;
        if(m==0)
        {
            nums1[0]=nums2[0];
        }
        for(;pointer_3>0&&(pointer_1>=0&&pointer_3!=pointer_1);)
        {
            if(nums2[pointer_2]>nums1[pointer_1])
            {
                nums1[pointer_3]=nums2[pointer_2];
                pointer_3--;
                pointer_2--;

            }
            else if(nums2[pointer_2]<=nums1[pointer_1])
            {
               nums1[pointer_3]=nums1[pointer_1];
                pointer_3--;
                pointer_1--;
            }
        }
        if(pointer_2>=0)
        {
            for(int j=0;j<=pointer_2;j++)
            {
                nums1[j]=nums2[j];
            }
        }
        
    }
}