package leetcode;

/**
 * @ClassName: RemoveDuplicates
 * @Description: 删除排序数组中的重复项  1
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

        public int removeDuplicates2(int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }
            int fast = 1, slow = 1;
            while (fast < n) {
                if (nums[fast] != nums[fast - 1]) {
                    nums[slow] = nums[fast];
                    ++slow;
                }
                ++fast;
            }
            return slow;
        }

    public int removeDuplicates3(int[] nums) {
        if (nums.length <= 1) return 1;
        int fast = 1;
        int slow = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

}
