//Link -> https://codeforces.com/contest/1492/problem/B

import java.util.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws IOException
	{
		Scanner inn=new Scanner(System.in);
		int testcases = inn.nextInt();
		for(int lpp=0;lpp<testcases;lpp++)
		{
			int arr_size=inn.nextInt();
			int[] arr=new int[arr_size];
			for(int i=0;i<arr_size;i++)
			{
				arr[i]=inn.nextInt();
			}
			HashSet<Integer> st=new HashSet<>();
			int[] arri=new int[arr_size];
			ArrayList<Integer> ans=new ArrayList<Integer>();
			for(int l=0;l<arr_size;l++)
			{
				arri[l]=l+1;
				st.add(arri[l]);
			}
			int end=arr.length;
			int strt=arr_size-1;
			int ptr1=arr_size-1;
			while(ans.size()!=arr_size)
			{
				while(strt>-1&&!st.contains(arri[strt]))
					strt--;
				while(ptr1>-1&&arr[ptr1]!=arri[strt])
					ptr1--;
				for(int mm=ptr1;mm<end;mm++)
				{	
					ans.add(arr[mm]);
					st.remove(arr[mm]);
				}
				end=ptr1;
			}
			for(int km: ans)
				System.out.print(km+" ");
			System.out.println("");
		}
	}
}