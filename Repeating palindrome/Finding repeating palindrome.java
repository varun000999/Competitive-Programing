import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long count=n;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i+1)==s.charAt(i))
            {
                int j=i;
                while((j<n)&&((s.charAt(j))==(s.charAt(i))))
                {
                    j++;
                }
                count=count+j*(j+1)/2;
            }
            else if((i!=0)&&(s.charAt(i-1)==s.charAt(i+1))) {
                count++;
                
            }
        }
        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}