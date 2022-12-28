package leetcode;



//翻转链表 1
public class Fanzhuanlianbiao {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(3);
        ListNode listNode14 = new ListNode(4);
        listNode1.next = listNode12;
        listNode12.next = listNode13;
        listNode13.next = listNode14;

        ListNode ams = fanzhuan1(listNode1);
//        ListNode t = ams;
        while (true) {
            if (ams == null) break;
            System.out.println(ams.value);
            ams = ams.next;
        }

    }

    static ListNode fanzhuan3(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while (true) {
            if (curr == null) break;
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }



    //迭代
   static ListNode fanzhuan(ListNode head) {
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

    //递归
    static ListNode fanzhuan1(ListNode head){
       if (head == null || head.next == null) {return head;}
       ListNode listNode = fanzhuan1(head.next);
       head.next.next = head;
       head.next = null;
       return listNode;
    }



}
