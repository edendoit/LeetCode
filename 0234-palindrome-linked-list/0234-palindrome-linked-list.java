/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // VERSION 1 : Time O(n) / Space O(n)
    // public boolean isPalindrome(ListNode head) {
    //     ListNode p1 = head;
    //     ListNode p2 = null;
        
    //     while(head != null) {
    //         ListNode temp = new ListNode(head.val);
    //         temp.next = p2;
    //         p2 = temp;
    //         head = head.next;
    //     }
    //     while(p1 != null && p2 != null) {
    //         if(p1.val == p2.val){
    //             p1 = p1.next;
    //             p2 = p2.next;
    //         } else {
    //             return false;
    //         }
    //     }
    //     if(p1 != null) return false;
    //     if(p2 != null) return false;

    //     return true;
    // }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        while(slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;     
        }

        ListNode p1 = head;
        ListNode p2 = prev;
        while(p2 != null) {
            if(p1.val == p2.val) {
                p1 = p1.next;
                p2 = p2.next;
            } else return false;
        }


        return true;

    }
}