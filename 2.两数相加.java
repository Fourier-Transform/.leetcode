/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode l3 = new ListNode(0);
        ListNode p = l3;
        int carry = 0;
        while(p1 != null && p2 != null){
            p.next = new ListNode((p1.val + p2.val + carry)%10);
            p = p.next;
            if(p1.val + p2.val + carry> 9){
                carry = 1;
            }else{
                carry = 0;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        while(p1 != null){
            p.next = new ListNode((p1.val + carry)%10);
            p = p.next;
            if(p1.val + carry > 9){
                carry = 1;
            }else{
                carry = 0;
            }
            p1 = p1.next;
        }
        while(p2 != null){
            p.next = new ListNode((p2.val + carry)%10);
            p = p.next;
            if(p2.val + carry > 9){
                carry = 1;
            }else{
                carry = 0;
            }
            p2 = p2.next;
        }
        if(carry != 0){
            p.next = new ListNode(1);
            p = p.next;
        }
        return l3.next;
    }
}
// @lc code=end

