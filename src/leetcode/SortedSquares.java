package leetcode;

/**
 * @ClassName: SortedSquares
 * @Description:
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/29 23:47
 * @Version 1.0
 */
public class SortedSquares {

    public int[] sortedSquares(int[] nums) {

        int left = 0; int right = nums.length-1;

        int[] ans = new int[nums.length];
        int le = nums.length-1;
        while (left < right) {
            if (nums[left] * nums[left] >= nums[right] * nums[right]){
                ans[le--] = nums[left] * nums[left];
                left++;
            }else {
                ans[le--] = nums[right] * nums[right];
                --right;
            }
        }
        return ans;
    }


}
