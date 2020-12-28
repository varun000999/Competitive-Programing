import java.util.*;
import java.io.*;
public class Solve {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
       int testcases=Integer.parseInt(bf.readLine());
       for(int i=0;i<testcases;i++)
       {
           int arrsize=Integer.parseInt(bf.readLine());
           String inputarr=bf.readLine();
           String[] tmp=inputarr.trim().split("\\s+");
           int[] arr=new int[arrsize];
           int yaseels=0;
           //int aldel=Integer.MIN_VALUE;
           for(int j=0;j<arrsize;j++)
           {
               arr[j]=Integer.parseInt(tmp[j]);
               yaseels=yaseels+arr[j];
           }
           int maxsofar1=arr[0];
           int maxtillnow1=arr[0];
           for(int k=1;k<arrsize-1;k++)
           {
               maxtillnow1=arr[k]>arr[k]+maxtillnow1?arr[k]:arr[k]+maxtillnow1;
               maxsofar1=maxtillnow1>maxsofar1?maxtillnow1:maxsofar1;
           }
           int maxsofar2=arr[1];
           int maxtillnow2=arr[1];
           for(int k=2;k<arrsize;k++)
           {
               maxtillnow2=arr[k]>arr[k]+maxtillnow2?arr[k]:arr[k]+maxtillnow2;
               maxsofar2=maxtillnow2>maxsofar2?maxtillnow2:maxsofar2;
           }
           int maxulti=maxsofar1>maxsofar2?maxsofar1:maxsofar2;
           
           if(yaseels>maxulti)
           {
               System.out.println("YES");
           }
           else
           {
               System.out.println("NO");
           }
       }
    }
    
}
