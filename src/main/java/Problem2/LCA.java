package Problem2;

import Problem1.TreeNode;

public class LCA {
    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        return helper(root, p, q);
    }
    public static TreeNode<Integer> helper(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q){
        if(root==null){
            return null;
        }
        if(root.val==p.val|| root.val==q.val){
            return root;
        }
        TreeNode left= helper(root.left, p, q);
        TreeNode right= helper(root.right, p, q);
        if(left!= null && right!=null){
            return root;
        }
        if(left==null){
            return right;
        }
        else{
            return left;
        }
    }
}