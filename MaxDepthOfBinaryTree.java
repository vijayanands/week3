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
    int max_depth = 0;
	public int maxDepth(TreeNode a) {
	    if (a == null)
	        return max_depth;
	    else {
	        findDepth(a, 0);
	    }
	    return max_depth;
	}
	
    public void findDepth(TreeNode a, int curDepth) {
        curDepth++;
        if ((a.left == null) && (a.right == null)) {
            if (curDepth > max_depth) {
                max_depth = curDepth;
            }
        } else {
            if (a.left != null) 
                findDepth(a.left, curDepth);
            if (a.right != null)
                findDepth(a.right, curDepth);
        }
    }	
}
