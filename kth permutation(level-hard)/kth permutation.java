class Solution {
    public String recurs(String s,int k)
    {
        int len=s.length();
        int fact=factorial(len-1);
        if(k==1)
        {
            return s;
        }
        else if(k==2)
        {
            String tt="";
            tt=tt+s.charAt(len-1);
            tt=tt+s.charAt(len-2);
            s=s.substring(0,len-2)+tt;
            return s;
        }
        else if(k>fact)
        {
            int count=0;
            while(k>fact)
            {
                count++;
                k=k-fact;
            }
            String finl="";
            finl=finl+s.charAt(count);
            s=charRemoveAt(s,count);
            finl=finl+recurs(s,k);
            return finl;
        }
        else{
            String finl="";
            finl=finl+s.charAt(0);
            s=charRemoveAt(s,0);
            finl=finl+recurs(s,k);
            return finl;
        }
    }
    public int factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
    public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }
    public String getPermutation(int n, int k) {
        String temp="";
        for(int i=1;i<=n;i++)
        {
            temp=temp+i;
        }
        String finl="";
        finl=recurs(temp,k);
        return finl;
    }
}