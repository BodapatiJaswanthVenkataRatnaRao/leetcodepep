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
    ArrayList<Integer> result=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return result.get(k-1);
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
    }
}
// class Solution {
//           int count=1;
//               public int kthSmallest(TreeNode root, int k) {
//                       return helper(root,k);
//                           }
//                           …}
// }