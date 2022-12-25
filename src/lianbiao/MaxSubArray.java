package lianbiao;

/**
 * @ClassName: MaxSubArray
 * @Description: 连续子数组的最大和  1
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/11/30 01:01
 * @Version 1.0
 */
public class MaxSubArray {


    public static int maxSubArray3(int[] nums){
        int pre = 0;
        int masAns = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre, pre+nums[i]);
            masAns = Math.max(masAns,pre);
        }
        return masAns;
    }



    public static int maxSubArray(int[] nums){
        int length = nums.length;
        int mmax = nums[0];
        for (int i = 0; i < length; i++) {
            int sum = nums[i];
            int max = nums[i];
            for (int j = i+1;  j < length; j++){
                sum += nums[j];
                max = Math.max(max,sum);
            }
            mmax = Math.max(max,mmax);
        }
        return mmax;
    }

    public static int maxSubArray2(int[] nums){
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }


}
