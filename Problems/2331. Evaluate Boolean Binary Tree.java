/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean evaluateTree(TreeNode root) {
        return calculate(root);
        
        
    }
    
    public boolean calculate(TreeNode node){
        if (node.left==null && node.right==null){
            return (node.val==1);
        }
        else {
            boolean l=calculate(node.left);
            boolean r=calculate(node.right);
            if (node.val==2)
                return (l || r);
            else  
                return (l && r); 
        }
        
            
        
        
    }
}
