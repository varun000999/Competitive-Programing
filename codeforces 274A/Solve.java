import java.util.*;
import java.io.*;
public class Solve {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String t=bf.readLine();
        String[] bb=t.trim().split("\\s+");
        int size=Integer.parseInt(bb[0]);
        int k=Integer.parseInt(bb[1]);
        int[] arr=new int[size];
        String tt=bf.readLine();
        String[] strs=tt.trim().split("\\s+");
        for(int i=0;i<size;i++)
        {
            arr[i]=Integer.parseInt(strs[i]);
        }
        Set<Integer> st=new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<size;i++)
        {
            if(arr[i]%k==0&&!st.contains(arr[i]/k))
            {
                st.add(arr[i]);
            }
            else if(arr[i]%k!=0)
            {
                st.add(arr[i]);
            }
        }
        System.out.println(st.size());
    }
    
}
