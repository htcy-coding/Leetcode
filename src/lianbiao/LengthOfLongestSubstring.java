package lianbiao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @ClassName: LengthOfLongestSubstring
 * @Description: 最长不含重复字符的子字符串  1
 * https://leetcode.cn/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/11/30 21:47
 * @Version 1.0
 */
public class LengthOfLongestSubstring {


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aavuuaa"));
    }

    //动态归纳法
   static public int lengthOfLongestSubstring(String s) {
       if(s.isEmpty()) return 0;
        int max = 0;
        HashSet<Character> chars = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            chars.add(c);
            for (int j = i + 1; j < s.length(); j++) {
                char c1 = s.charAt(j);
                if (chars.contains(c1))break;
                chars.add(c1);
                max = Math.max(max,chars.size());
            }
            chars.clear();
        }
        return max;
    }


        public int lengthOfLongestSubstring4(String s) {
            Map<Character, Integer> dic = new HashMap<>();
            int res = 0, tmp = 0;
            for(int j = 0; j < s.length(); j++) {
                int i = j - 1;
                while(i >= 0 && s.charAt(i) != s.charAt(j)) i--; // 线性查找 i
                tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
                res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
            }
            return res;
        }


        public int lengthOfLongestSubstring1(String s) {
            Map<Character, Integer> dic = new HashMap<>();
            int res = 0, tmp = 0;
            for(int j = 0; j < s.length(); j++) {
                int i = dic.getOrDefault(s.charAt(j), -1); // 获取索引 i
                dic.put(s.charAt(j), j); // 更新哈希表
                tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
                res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
            }
            return res;
        }


        public int lengthOfLongestSubstring3(String s) {
            Map<Character, Integer> dic = new HashMap<>();
            int i = -1, res = 0;
            for(int j = 0; j < s.length(); j++) {
                if(dic.containsKey(s.charAt(j)))
                    i = Math.max(i, dic.get(s.charAt(j))); // 更新左指针 i
                dic.put(s.charAt(j), j); // 哈希表记录
                res = Math.max(res, j - i); // 更新结果
            }
            return res;
        }



}
