import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
        long sum=1;
        long count=0;
        long previouscandy=1;
        long bigflips=0;
        long highestbid=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]>arr[i])
            {
                previouscandy++;
                sum=sum+previouscandy;
                count=0;
                highestbid=0;
                bigflips=0;
            }
            else if(arr[i+1]==arr[i])
            {
                count++;
                previouscandy=1;
                sum=sum+previouscandy;
            }
            else if(arr[i+1]<arr[i])
            {
                if(bigflips==0)
                    highestbid=previouscandy;
                bigflips++;
                count++;
                if(highestbid<=bigflips)
                    sum=sum+count+1;
                else
                    sum=sum+count;
                previouscandy=1;
            }
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
