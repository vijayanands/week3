/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public int isSameTree(TreeNode a, TreeNode b) {
	    return checkNode(a,b);
	}
	
	int checkNode(TreeNode a, TreeNode b) {
	    if (a != null) {
	        if (b == null)
	            return 0;
    	    if (a.val == b.val) {
    	        if (checkNode(a.left, b.left) == 1) 
    	            return checkNode(a.right, b.right);
    	        else
    	            return 0;
    	    } else {
    	        return 0;
    	    }
	    } else {
	        if (b != null)
	            return 0;
	        else
	            return 1;
	    }
	}
}
