package lianbiao;

/**
 * @ClassName: GetIntersectionNode
 * @Description: 两个链表的第一个公共节点
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/4 11:31
 * @Version 1.0
 */
public class GetIntersectionNode {



    ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode listNodea = headA;
        ListNode listNodeb = headB;
        while (true) {
            if (listNodea == null) break;
            while (true) {
                if (listNodeb == null) break;
                if (listNodea.value == listNodeb.value)
                    return listNodea;
                listNodeb = listNodeb.next;
            }
            listNodea = listNodea.next;
        }
        return null;
    }





    ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode nodea = headA;
        ListNode nodeb = headB;
        while (nodea != null) {
            while (nodeb != null){
                if (nodea.value == nodeb.value)
                    return nodea;
                nodeb = nodeb.next;
            }
            nodea = nodea.next;
        }
        return null;
    }


}
