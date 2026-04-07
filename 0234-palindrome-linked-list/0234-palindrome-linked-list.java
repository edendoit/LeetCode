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
    public boolean isPalindrome(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = null;
        
        while(head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = p2;
            p2 = temp;
            head = head.next;
        }
        while(p1 != null && p2 != null) {
            if(p1.val == p2.val){
                p1 = p1.next;
                p2 = p2.next;
            } else {
                return false;
            }
        }
        if(p1 != null) return false;
        if(p2 != null) return false;

        return true;
    }
}