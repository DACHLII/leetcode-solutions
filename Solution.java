/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // ListNode slowPtr = head;
        // ListNode fastPtr = head;
        // while(slowPtr != null && fastPtr != null && fastPtr.next != null)
        // {
        //     slowPtr = slowPtr.next;
        //     fastPtr = fastPtr.next.next;
        //     if(slowPtr == fastPtr)
        //     {
        //         return true;
        //     }
        // }

        // return false;

        ListNode curr = head;
        HashSet<ListNode> seenNodes = new HashSet<>();
        while(curr != null)
        {
            if(!seenNodes.add(curr)){
                return true;
            }
            else
            {
                seenNodes.add(curr);
            }
            curr = curr.next;
        }
        return false;
    }
}
// @lc code=end

