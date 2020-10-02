class Solution {
     public boolean repeatedSubstringPattern(String str) {
        int len=str.length();
         for(int i=0;i<len/2;i++)
         {
             if(len%(i+1)==0)
             {
                 int j=i;
                 int p=0;
                 boolean status=true;
                 while(j-p>-1)
                 {
                     if(str.charAt(j-p)!=str.charAt(len-(p+1)))
                     {
                         status=false;
                         break;
                     }
                     p++;
                 }
                 if(status==true&&str.charAt(len-(i+2))==str.charAt(len-1))
                 {
                     return true;
                 }
             }
         }
         return false;
        //return s.substring(1, s.length() - 1).contains(str);
    }
}

***********************************************************************************************************************************************************************************************

117/120 case passed
the problem is with when i=0
means when the len is 1 as 1 divides everything. can refer to 2 line code (jugaad) at leetcode discussion.