class Solution {
    List<Integer> list = new ArrayList<>();
    public void preOrder(TreeNode node){
        if(node != null) list.add(node.val);
        if(node.left != null) preOrder(node.left);
        if(node.right != null) preOrder(node.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return list;
        preOrder(root);
        return list;
    }
}
