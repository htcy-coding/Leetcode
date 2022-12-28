package leetcode;

/**
 * @ClassName: GetKthFromEnd
 * @Description:获取链表中倒数第k个节点
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/11/29 22:53
 * @Version 1.0
 */
public class GetKthFromEnd {


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(3);
        ListNode listNode14 = new ListNode(4);
        listNode1.next = listNode12;
        listNode12.next = listNode13;
        listNode13.next = listNode14;

       ListNode listNode = getKthFromEnd(listNode1,1);

        while (listNode != null) {
            System.out.println(listNode.value);
            listNode = listNode.next;
        }
    }

    static public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (true){
            if (fast == null) break;
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


   static public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
