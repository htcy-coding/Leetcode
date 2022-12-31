package leetcode;

/**
 * @ClassName: MinSubArrayLen
 * @Description:
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/30 00:02
 * @Version 1.0
 */
public class MinSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

}
