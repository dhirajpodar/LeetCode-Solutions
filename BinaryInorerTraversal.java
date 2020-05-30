class Solution {
    List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode node){
        if(node.left != null)inorder(node.left);
        if(node != null) list.add(node.val);
        if(node.right != null )inorder(node.right);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return list;
        inorder(root);
        return list;
    }
}
