class Solution {
    List<List<Integer>> finl=new ArrayList();
    public void life(int[] candidates,List<Integer> previouss,int target,int start)
    {
        for(int i=start;i<candidates.length;i++)
        {
            if(candidates[i]==target)
            {
                previouss.add(candidates[i]);
                finl.add(previouss);
                break;
            }
            else if(candidates[i]<target)
            {
                List<Integer> previous=new ArrayList<>(previouss);
                if(i > start && candidates[i] == candidates[i-1]) continue;
                previous.add(candidates[i]);
                life(candidates,previous,target-candidates[i],i+1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> previous=new ArrayList<>();
        Arrays.sort(candidates);
        life(candidates,previous,target,0);
        return finl;
    }
}