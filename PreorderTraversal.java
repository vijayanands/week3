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
	ArrayList<Integer> result = new ArrayList<Integer>();
	public ArrayList<Integer> preorderTraversal(TreeNode a) {
	    // preorder is root, left , right
	    addNode(a);
	    return result;
	}
	
	public void addNode(TreeNode a) {
	    if (a != null) {
	        result.add(a.val);
	        addNode(a.left);
	        addNode(a.right);
	    }
	}
}
