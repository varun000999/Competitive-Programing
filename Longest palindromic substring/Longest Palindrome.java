class Solution {
    String Longest="";
    public String longestPalindrome(String s) {
        if(s.length()<2)
        {
            return s;
        }
        for(int i=0;i<s.length()-1;i++)
        {
            String fdd=checkvalid(i,i+1,s);
            if(fdd.length()==0)
            {
                fdd=Character.toString(s.charAt(i));
            }
            if(fdd.length()>Longest.length())
            {
                Longest=fdd;
            }
        }
        for(int i=1;i<s.length()-1;i++)
        {
            int j=1;
            String bcc=Character.toString(s.charAt(i));
            while(((i-j)>-1&&(i+j)<s.length())&&s.charAt(i-j)==s.charAt(i+j))
            {
                bcc=Character.toString(s.charAt(i-j))+bcc+Character.toString(s.charAt(i+j));
                j++;
            }
            if(Longest.length()<bcc.length())
            {
                Longest=bcc;
            }
        }
        return Longest;
    }
    public String checkvalid(int x,int y,String s)
    {
        String tmp="";
        while((x>-1&&y<s.length())&&s.charAt(x)==s.charAt(y))
        {
            tmp=Character.toString(s.charAt(x))+tmp+Character.toString(s.charAt(y));
            x=x-1;y=y+1;
        }
        return tmp;
    }
}