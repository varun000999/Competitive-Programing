class Solution {
    public int titleToNumber(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            count+=((int)s.charAt(i)-64)*Math.pow(26,s.length()-(i+1));
        }
        return count;
    }
}