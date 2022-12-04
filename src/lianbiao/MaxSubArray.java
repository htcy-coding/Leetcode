package lianbiao;

/**
 * @ClassName: MaxSubArray
 * @Description: 连续子数组的最大和
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/11/30 01:01
 * @Version 1.0
 */
public class MaxSubArray {


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
