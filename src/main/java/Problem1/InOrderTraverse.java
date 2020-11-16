package Problem1;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack= new Stack<>();
        TreeNode tree= root;
        while(tree!=null){
            stack.push(tree);
            tree=tree.left;
        }
        while(!stack.isEmpty()){
            TreeNode<Integer> branch= stack.pop();
            result.add( branch.val);
            branch=branch.right;
            while(branch!=null){
                stack.push(branch);
                branch=branch.left;
            }
        }
        return result;
    }
}