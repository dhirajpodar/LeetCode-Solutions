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
    public void sumNum(TreeNode root, int k){
        if(root == null) return;
        if(root.left == null && root.right == null){
            sum += root.val+k;
        }
        if(root.left != null) sumNum(root.left,(k+root.val) * 10);
        if(root.right != null) sumNum(root.right,(k+root.val) * 10);
    }
    public int sumNumbers(TreeNode root) {
        sumNum(root,0);
        return sum;
    }
}
