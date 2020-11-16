package Problem3;
import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        if(root==null){
            root= new TreeNode<Integer>(valToInsert);
        }
        if(root.val>valToInsert){
            if(root.left==null){
                root.left=new TreeNode<Integer>(valToInsert);
            }
            else{
                insert(root.left, valToInsert);
            }
        }
        if(root.val<=valToInsert){
            if(root.right==null){
                root.right= new TreeNode<Integer>(valToInsert);
            }
            else{
                insert(root.right, valToInsert);
            }
        }
    }
}