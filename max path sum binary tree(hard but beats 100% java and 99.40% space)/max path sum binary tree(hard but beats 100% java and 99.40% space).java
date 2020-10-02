class Solution {
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxxPathSum(root);
        return maxsum;
    }
    public int maxxPathSum(TreeNode root) {
        int tempsum=Integer.MIN_VALUE;
        if(root==null)
            return 0;
        int l=maxxPathSum(root.left);
        int r=maxxPathSum(root.right);
        maxsum=Math.max(l+r+root.val,maxsum);
        tempsum=Math.max(l,r)+root.val;
        tempsum=Math.max(root.val,tempsum);
        maxsum=Math.max(tempsum,maxsum);
        return tempsum;
    }
}