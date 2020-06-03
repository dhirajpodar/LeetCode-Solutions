class BSTIterator {
    Stack<TreeNode> stack = new Stack();
    public BSTIterator(TreeNode root) {
        pushToLeft(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        pushToLeft(node.right);
        return node.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    private void pushToLeft(TreeNode node){
        if(node != null){
            stack.push(node);
            pushToLeft(node.left);
        }
    }
}
