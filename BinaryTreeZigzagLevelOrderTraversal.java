 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        
        if(root == null) return finalList;
        
        Stack<TreeNode> stack1 = new Stack();
        Stack<TreeNode> stack2 = new Stack();
        
        stack1.push(root);
        
        
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            List<Integer> list1 = new ArrayList<>();
            while(!stack1.isEmpty()){
                TreeNode node = stack1.pop();
                list1.add(node.val);
                if(node.left != null) stack2.push(node.left);
                if(node.right != null) stack2.push(node.right);
            }
            if(!list1.isEmpty()) finalList.add(list1);
            
            List<Integer> list2 = new ArrayList<>();
            while(!stack2.isEmpty()){
                TreeNode node = stack2.pop();
                list2.add(node.val);
                if(node.right != null) stack1.push(node.right);
                if(node.left != null) stack1.push(node.left);
            }
            if(!list2.isEmpty()) finalList.add(list2);
        }
        return finalList;
        
    }
