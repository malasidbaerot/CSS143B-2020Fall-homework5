package Problem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        LinkedList<TreeNode> nQ= new LinkedList<>();
        LinkedList<Integer> lQ= new LinkedList<>();
        nQ.offer(root);
        lQ.offer(1);
        while(!nQ.isEmpty()){
            TreeNode<Integer> node= nQ.poll();
            int level= lQ.poll();
            List <Integer> list= null;
            if(result.size()<level){
                list= new ArrayList<>();
                result.add(list);
            }
            else{
                list= result.get(level-1);
            }
            list.add(node.val);
            if(node.left != null){
                nQ.offer(node.left);
                lQ.offer(level+1);
            }
            if(node.right!=null){
                nQ.offer(node.right);
                lQ.offer(level+1);
            }
        }
        return result;
    }
}