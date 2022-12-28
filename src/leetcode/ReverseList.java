package leetcode;

/**
 * @ClassName: ReverseList
 * @Description:  1
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/11/29 23:14
 * @Version 1.0
 */
public class ReverseList {


//    public ListNode reverseList4(ListNode head) {
//
//
//    }

    public static void main(String[] args) {

    }



    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }


    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head.next;
        head.next = null;
        return newHead;
    }


}
