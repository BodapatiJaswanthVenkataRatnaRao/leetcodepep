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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer=new ArrayList<>();
        if(root==null) return answer;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            double sum=0;
            for(int i=q.size();i!=0;i--){
                TreeNode node=q.poll();
                sum+=node.val;
             if(node.left!=null) q.add(node.left);
             if(node.right!=null) q.add(node.right);
            }
            answer.add(sum/size);
        }
        return answer;
    }
}