class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        do{
            count+=n/5;
            n=n/5;
        }while(n>=5);
        return count;
    }
}