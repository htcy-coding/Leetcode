package lianbiao;

import java.util.HashSet;

/**
 * @ClassName: LengthOfLongestSubstring
 * @Description: 最长不含重复字符的子字符串
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/11/30 21:47
 * @Version 1.0
 */
public class LengthOfLongestSubstring {


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
    }

    //动态归纳法
   static public int lengthOfLongestSubstring(String s) {
       if(s == null || s.equals("")) return 0;
       if(s.length() == 1) return 1;
        int max = 1;
        HashSet<Character> chars = new HashSet();
        char[] chars1 = s.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            char c = chars1[i];
            chars.add(c);
            for (int j = i + 1; j < chars1.length; j++) {
                char c1 = chars1[j];
                if (!chars.contains(c1)) {
                    chars.add(c1);
                }else {
                    max = Math.max(max,chars.size());
                    break;
                }
                max = Math.max(max,chars.size());
            }
            chars.clear();
        }
        return max;
    }

}
