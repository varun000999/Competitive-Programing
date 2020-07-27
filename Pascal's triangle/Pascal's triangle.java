class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++)
        {
            arr.add(new ArrayList<Integer>());
            for(int j=0;j<i+1;j++)
            {
                if(j==0 || j==i)
                {
                    arr.get(i).add(1);
                }
                else
                {
                    arr.get(i).add(arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
                }
            }
            
        }
        return arr;
        
    }
}