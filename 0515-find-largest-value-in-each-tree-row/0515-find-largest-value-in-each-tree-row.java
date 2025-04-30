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
    public List<Integer> largestValues(TreeNode root) {
        
       List<Integer> list = new ArrayList<>();
       if(root == null) return list;
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
        int maximum = Integer.MIN_VALUE;
          for(int i = q.size();i!=0;i-- ){
            root = q.poll();
            maximum = Math.max(maximum,root.val);
            if(root.left!=null) q.add(root.left);
            if(root.right!=null) q.add(root.right);

          }
          list.add(maximum);
       }
       return list;
    }
}