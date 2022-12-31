package leetcode;

/**
 * @ClassName: Search
 * @Description:
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/29 22:28
 * @Version 1.0
 */
public class Search {

    public int search(int[] nums, int target) {


        int left = 0; int right = nums.length-1;
        while (left <= right){
            if (nums[(left + right) / 2] == target) {
                return (left + right)/2;
            }else if (nums[left + right] < target){
                left = (left+right)/2 + 1;
            }else  if (nums[left + right] > target){
                right = (left + right)/ 2 -1;
            }

        }
        return  -1;
    }
    }
