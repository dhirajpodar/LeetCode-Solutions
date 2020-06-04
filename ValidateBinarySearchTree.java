public boolean isSubTreeLesser(TreeNode root, int value){
        if(root == null) return true;
        return root.val < value 
           && isSubTreeLesser(root.left,value) 
           && isSubTreeLesser(root.right,value); 
    }
    public boolean isSubTreeGreater(TreeNode root, int value){
        if(root == null) return true;
        return root.val > value 
           && isSubTreeGreater(root.left,value) 
           && isSubTreeGreater(root.right,value) ;
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null ) return true;
        return isSubTreeLesser(root.left,root.val)
          && isSubTreeGreater(root.right,root.val)
          && isValidBST(root.left)
          && isValidBST(root.right);
    }
