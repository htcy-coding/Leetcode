package leetcode.bd;

/**
 * @ClassName: MaxSubArray
 * @Description:https://leetcode.cn/problems/maximum-subarray/
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/24 16:56
 * @Version 1.0
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public int maxSubArray2(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int nowsum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                nowsum += nums[j];
                max = Math.max(max,nowsum);
            }
        }
        return max;
    }


    public int maxSubArray3(int[] nums) {
        int pre = 0, maxNum = nums[0];
        for (int num : nums) {
           pre = Math.max(pre + num,pre);
           maxNum = Math.max(pre,maxNum);

        }
        return maxNum;
    }

    }
