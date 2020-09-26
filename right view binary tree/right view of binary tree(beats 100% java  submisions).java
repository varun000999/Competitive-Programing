/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> finl=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root!=null)
        {
            rightSideView(root,0);   
        }
        return finl;
    }
    public void rightSideView(TreeNode root,int level)
    {
        if(root.right!=null)
        {
            if(level>=finl.size())
                finl.add(root.val);
            rightSideView(root.right,level+1);
        }
        if(root.left!=null)
        {
            if(level>=finl.size())
                finl.add(root.val);
            rightSideView(root.left,level+1);
        }
        else
        {
             if(level>=finl.size())
                finl.add(root.val);   
        }
    }
}