package lianbiao;

/**
 * @ClassName: RemoveDuplicates
 * @Description: 删除排序数组中的重复项
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/4 13:58
 * @Version 1.0
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]){
                slow++;
            }
        }
        return slow;
    }


}
