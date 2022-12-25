package lianbiao.bd;

import lianbiao.ListNode;

/**
 * @ClassName: GetIntersectionNode
 * @Description:https://leetcode.cn/problems/intersection-of-two-linked-lists/
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/24 16:55
 * @Version 1.0
 */
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode l1 = headA;

        out:while (true) {
            if (l1 == null) break;
            ListNode l2 = headB;
            while (l2 != null) {
                if (l1.value == l2.value)
                return l1;
                l2 = l2.next;
                break out;
            }
            l1 = l1.next;
        }

        return null;
    }
}
