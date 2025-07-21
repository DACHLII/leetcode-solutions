/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start

import java.util.ArrayList;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
        {
            return true;
        }
        else if(p == null && q != null || p != null && q == null) 
        {
            return false;
        }
        else if(p.val != q.val)
        {
            return false;
        }
        else
        {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
// @lc code=end
