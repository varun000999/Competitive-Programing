
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static String isValid(String s) {
        String a;
        ArrayList<Integer> arr = new ArrayList<Integer> ();
        HashMap<Character, Integer> sh = characterCount(s); 
        //HashMap<Integer, Integer> shf = characterCount(s); 
         for (Map.Entry entry : sh.entrySet()) {
             if(!arr.contains(entry.getValue()))
             {
                 arr.add((Integer) entry.getValue()); 
             }
         }
         if(arr.size()>2)
         {
             a="NO";
         }
         else if(arr.size()<2)
         {
             a="YES";
         }
         else {
             int t1=0;
             int t2=0;
             for (Map.Entry entry : sh.entrySet()) {
                 if(entry.getValue()==arr.get(0))
                 {
                     t1++;
                 }
                 else 
                 {
                     t2++;
                 }
             }
             if((t1>=2) && (t2>=2))
             {
                 a="NO";
             }
             else if(t2==1)
             {
                 a="YES";
             }
             else if(t1==1 && !(t2==2))
             {
                 a="YES";
             }
             else
             {
                 if(Math.abs(arr.get(0)-arr.get(1)) >1)
                 {
                     a="NO";
                 }
                 else
                 {
                     a="YES";
                 }
             }
         }
         return a;


    }
    static HashMap characterCount(String inputString) 
    { 
        // Creating a HashMap containing char 
        // as a key and occurrences as  a value 
        HashMap<Character, Integer> charCountMap 
            = new HashMap<Character, Integer>(); 
  
        // Converting given string to char array 
  
        char[] strArray = inputString.toCharArray(); 
  
        // checking each char of strArray 
        for (char c : strArray) { 
            if (charCountMap.containsKey(c)) { 
  
                // If char is present in charCountMap, 
                // incrementing it's count by 1 
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
  
                // If char is not present in charCountMap, 
                // putting this char to charCountMap with 1 as it's value 
                charCountMap.put(c, 1); 
            } 
        } 
        return charCountMap;
  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}