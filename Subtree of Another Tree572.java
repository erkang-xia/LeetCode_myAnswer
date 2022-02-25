class Solution {    
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root == null)
            return false;
        if(root.val == subRoot.val)
            if(compareTrees(root, subRoot))
                return true;
        if(isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot))
            return true;
        return false;
    }
    
    private boolean compareTrees(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        if(t1.val != t2.val)
            return false;
        return compareTrees(t1.left, t2.left) && compareTrees(t1.right, t2.right);
    }
}
