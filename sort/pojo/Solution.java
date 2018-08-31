package pojo;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root != null){
            Helper(root,result);
        }
        return result;
    }

    public static void Helper(TreeNode root, ArrayList<Integer> result){
        if(root.left != null){
            Helper(root.left,result);
        }
        result.add(root.val);

        if(root.right != null){
            Helper(root.right,result);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        Solution.inorderTraversal(treeNode);
    }
}
