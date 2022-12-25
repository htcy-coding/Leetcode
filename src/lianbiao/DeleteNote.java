package lianbiao;

/**
 * @ClassName: DeleteNote
 * @Description: 删除链表节点  1
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/11/29 22:36
 * @Version 1.0
 */
public class DeleteNote {

    public ListNode deleteNode(ListNode head, int val) {
      if (head.value == val) return head;
      ListNode t = head;
      while (true){
          if (t.value == val) {
              t.next = t.next.next;
              break;
          }else {
              t = t.next;
          }
      }
        return head;
    }

    /*
    *
    * */
//    public ListNode deleteNode(ListNode head, int val) {
//        if(head.value == val) return head.next;
//        ListNode t = head;
//        while (true) {
//            if (t.value == val){
//                t.next = t.next.next;
//                break;
//            }else {
//                t = t.next;
//            }
//        }
//        return head;
//    }


    public ListNode deleteNode2(ListNode head, int val) {
        if(head.value == val) return head.next;
        ListNode pre = head, cur = head.next;
        while(cur != null && cur.value != val) {
            pre = cur;
            cur = cur.next;
        }
        if(cur != null) pre.next = cur.next;
        return head;
    }


}
