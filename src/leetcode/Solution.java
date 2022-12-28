package leetcode;

import java.util.HashMap;

/**
 * @ClassName: Solution
 * @Description: 青蛙跳台阶问题  https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/?favorite=xb9nqhhg
 * @Author yuyang（yuyang_keep@163.com）  1
 * @Date 2022/11/29 21:57
 * @Version 1.0
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(newWays2(17));
        System.out.println(numWays3(17));
    }

   static HashMap<Integer,Integer> hashMap = new HashMap<>();




    /*
     * 递归法
     * */
    static public int numWays3(int n) {
        if (n == 1 || n == 2) return n;
        return numWays3(n-1) + numWays3(n-2);
    }

    /*
    * 递归法
    * */
   static public int numWays(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
       if (hashMap.containsKey(n)){
           return hashMap.get(n);
       }else {
           int ans = numWays(n-1) + numWays(n-2);
           hashMap.put(n,ans);
           return ans;
       }
    }

    /*
    * 动态规划法
    * */
    static public  int newWays2(int n){
         int pre = 1, curr = 1, sum;
         for(int i = 1; i < n; i++){
             sum = (pre + curr);
             pre = curr;
             curr = sum;
         }
         return curr;
     }

}
