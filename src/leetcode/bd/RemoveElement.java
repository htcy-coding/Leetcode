package leetcode.bd;

import java.util.LinkedList;

/**
 * @ClassName: RemoveElement
 * @Description:
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/29 23:26
 * @Version 1.0
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        LinkedList list = new LinkedList();
        list.add(1,3);
        int fast =0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

}
