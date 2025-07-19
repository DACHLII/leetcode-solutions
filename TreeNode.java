/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 */

// @lc code=start

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {

        TreeNode node = root;
        if(node == null)
        {
            return 0;
        }
        else
        {
            return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
            
        }
    }

}
// @lc code=end
