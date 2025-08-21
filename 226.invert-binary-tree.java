/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
        {
            return null;
        }
        else
        {
            TreeNode tempNode = new TreeNode();
            tempNode.right = root.right;
            root.right = root.left;
            root.left = tempNode.right;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
    }
}
// @lc code=end
