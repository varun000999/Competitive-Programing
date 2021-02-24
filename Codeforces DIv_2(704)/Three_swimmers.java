//	basic templates
//	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//	
//	System.out.println();
/*
	int testcases = inn.nextInt()//bf.readLine();
	for(int lpp=0;lpp<testcases;lpp++)
	{

	}
*/

// Link -> https://codeforces.com/contest/1492/problem/A

import java.util.*;

import javax.lang.model.util.ElementScanner6;

//import javax.lang.model.util.ElementScanner6;

import java.lang.*;
import java.io.*;
import java.lang.Math;

/* Name of the class has to be "Main" only if the class is public. */
public class Solve
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		//BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		Scanner inn=new Scanner(System.in);
		int testcases = inn.nextInt();
		for(int lpp=0;lpp<testcases;lpp++)
		{
			long p=inn.nextLong();
			long a=inn.nextLong();
			long b=inn.nextLong();
			long c=inn.nextLong();
			long tmp=p/a;
			if(p%a==0)
			{
				System.out.println(0);
				continue;
			}
			long diff=Math.abs(p-(tmp+1)*a);
			tmp=p/b;
			if(p%b==0)
			{
				System.out.println(0);
				continue;
			}
			diff=Math.abs(p-(tmp+1)*b)<diff?Math.abs(p-(tmp+1)*b):diff;
			tmp=p/c;
			if(p%c==0)
			{
				System.out.println(0);
				continue;
			}
			diff=Math.abs(p-(tmp+1)*c)<diff?Math.abs(p-(tmp+1)*c):diff;
			System.out.println(diff);
		}
	}
}
