import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class InvertBinaryTree {
     public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            
            if(node.left != null){
                queue.add(node.left);
            }
            
            if(node.right != null){
                queue.add(node.right);
            }
        }
        
        return root;
    }
    
}
