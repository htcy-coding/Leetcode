package leetcode;

/**
 * @ClassName: RemoveElements
 * @Description:
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/30 19:47
 * @Version 1.0
 */
public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode preNode = new ListNode(0);
        preNode.next = head;
        ListNode listNode = preNode;
        while (listNode.next != null) {
            if (listNode.next.value == val) {
                listNode.next = listNode.next.next;
            }else {
                listNode = listNode.next;
            }
        }
        return preNode.next;
    }

    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        // 因为删除可能涉及到头节点，所以设置dummy节点，统一操作
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.value == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

}
