/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        for(int i=1;i<intervals.size();i++)
        {
            int tobecomp=intervals.get(i).start;
            for(int j=0;j<i;j++)
            {
                if(intervals.get(j).start>tobecomp)
                {
                    Interval temp=new Interval();
                    temp=intervals.get(i);
                    intervals.set(i,intervals.get(j));
                    intervals.set(j,temp);
                }
            }
        }
        for(int i=0;i<intervals.size()-1;i++)
        {
            if(intervals.get(i+1).start==intervals.get(i).start)
            {
                if(intervals.get(i+1).end>intervals.get(i).end)
                {
                    intervals.remove(i);
                }
                else
                {
                    intervals.remove(i+1);
                }
                i--;
            }
            else if(intervals.get(i).end>=intervals.get(i+1).start)
            {
                intervals.get(i).end=Math.max(intervals.get(i).end,intervals.get(i+1).end);
                intervals.remove(i+1);
                i--;
            }
        }
        return intervals;

    }
}
