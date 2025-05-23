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
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.left);
        flatten(root.right);
       TreeNode lefttemp=root.left;
       root.left=null;
       TreeNode righttemp=root.right;
       if(lefttemp==null){
        return;
       }
       else{
        root.right=lefttemp;
        while(root.right!=null){
            root=root.right;
        }
        root.right=righttemp;
       }
    }
}