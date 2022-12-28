package leetcode.bd;

import leetcode.ListNode;

/**
 * @ClassName: DeleteDuplicates
 * @Description: https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/
 *  删除排序链表中的重复元素 II
 * 给定一个已排序的链表的头 head ， 删除原始链表中所有重复数字的节点，只留下不同的数字 。返回 已排序的链表 。
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/24 19:13
 * @Version 1.0
 */
public class DeleteDuplicates {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(45);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;

        ListNode a = deleteDuplicates2(listNode1);

        while (a != null) {
            System.out.println(a.value);
            a = a.next;
        }
    }

    static   public ListNode deleteDuplicates5(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null ) {

            if (cur.next.value == cur.next.next.value) {
                cur.next = cur.next.next;
            }

        }

        return dummy.next;
    }

      static   public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return head;
            }

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode cur = dummy;
            while (cur.next != null && cur.next.next != null) {
                if (cur.next.value == cur.next.next.value) {
                    int x = cur.next.value;
                    while (cur.next != null && cur.next.value == x) {
                        cur.next = cur.next.next;
                    }
                } else {
                    cur = cur.next;
                }
            }

            return dummy.next;
    }

   static public ListNode deleteDuplicates2(ListNode head) {
       ListNode slow = new ListNode(0);
       slow.next = head;
       ListNode fast = slow;
        while (fast.next != null && fast.next.next != null) {
            if (fast.value == fast.next.value) {
                while (fast.next != null && fast.value == fast.next.value){
                    fast = fast.next;
                }
            }else {
                fast = fast.next;
            }
        }
        return slow.next;
    }

}
