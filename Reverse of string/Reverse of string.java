class Solution {
    public String reverseWords(String s) {
        String last="";
        s=s+" @";
        String temp="";
        for(int i=0;s.charAt(i)!='@';i++)
        {
            if(s.charAt(i)==' ')
            {
                while(s.charAt(i+1)==' ')
                {
                    i++;
                }
                temp=temp+" ";
                last=temp+last;
                temp="";
            }
            else if(s.charAt(i)!=' ')
            {
                temp=temp+s.charAt(i);
            }
        }
        return last.trim();
    }
}