import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inn=new Scanner(System.in);
        int n=inn.nextInt();
        int p=inn.nextInt();
        int[] arr=new int[p+1];
        for(int i=0;i<n;i++)
        {
            arr=method(arr,inn.nextInt(),inn.nextInt());
        }
        for(int m=1;m<p+1;m++)
        {
            arr[m]=arr[m]+arr[m-1];
        }
        int max=0;
        int count=0;
        for(int z=0;z<p+1;z++)
        {
            if(arr[z]==1)
            {
                max=max>count?max:count;
                count=0;
            }
            else
            {
                count++;
            }
        }
        max=max>count?max:count;
        System.out.println(max);
        /*for(int j:arr)
        {
            System.out.print(j+" ");
        }
        */
        
        
    }
    public static int[] method(int[] arrr,int index,int val)
    {
        if(index-val<0)
            arrr[0]=arrr[0]+1;
        else
            arrr[index-val]++;
        if(index+val+1<=arrr.length-1)
            arrr[index+val+1]=arrr[index+val+1]-1;            
        return arrr;
    }
}