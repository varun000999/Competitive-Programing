/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static String longest(String input1)
    {
        String largestt="";
        String temp="";
        input1=input1+" ";
        for(int i=0;i<input1.length();i++)
        {
            if(input1.charAt(i)==' ')
            {
                if(temp.length()>largestt.length())
                {
                    largestt=temp;
                    temp="";
                }
                else
                {
                    temp="";
                }
                
            }
            else{
                temp=temp+input1.charAt(i);
                
            }
        }
        return largestt;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println(longest("she is very beautiful"));
	}
}
