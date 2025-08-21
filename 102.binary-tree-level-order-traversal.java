/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> childNodes = new LinkedList<>();
        // while there are still lower levels to check...?
        childNodes.add(root);
        while(!childNodes.isEmpty())
        {
            // take each node, extract the value
            // then add those node's children to the queue
            // delete that parent node and move on
            ArrayList<Integer> currLevel = new ArrayList<>();
            
            for(int i = 0; i < childNodes.size(); i++)
            {   TreeNode currNode = childNodes.peek();
                
                if(currNode != null)
                {   
                    currLevel.add(currNode.val);
                }
            }

            result.add(currLevel);

            if(currNode.left != null)
            {
                childNodes.add(currNode.left);
            }
            
            if(currNode.right != null)
            {
                childNodes.add(currNode.right);
            }

            childNodes.remove();


        }
        return result;
    }
}
// @lc code=end
