
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int match=0;
        int len=a.length()+b.length();
        HashMap<Character, Integer> hash1=characterCount(a);
        HashMap<Character, Integer> hash2=characterCount(b);
        for (Map.Entry entry : hash1.entrySet()) { 
            if(hash2.containsKey(entry.getKey()))
            {
                match= match +Math.min(hash2.get(entry.getKey()), hash1.get(entry.getKey()));
            }
        } 
        
        return len-2*match;
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

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
