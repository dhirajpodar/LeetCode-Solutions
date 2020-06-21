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
    int sum = 0;
    public boolean isLeaf(TreeNode root){
        if(root == null) return false;
        return root.left == null && root.right == null;
    }
    public void sumLeaf(TreeNode root){
        if(root == null) return;
        if(root.left != null && isLeaf(root.left)){
            sum += root.left.val;
        }
        if(root.left != null) sumLeaf(root.left);
        if(root.right != null) sumLeaf(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        sumLeaf(root);
        return sum;
    }
}
