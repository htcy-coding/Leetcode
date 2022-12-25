package lianbiao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @ClassName: FirstUniqChar
 * @Description:第一个只出现一次的字符
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/11/30 23:05
 * @Version 1.0
 */
public class FirstUniqChar {

    HashMap<Integer, Character> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(firstUniqChar("letetcodel"));
    }


    static public  int first(String s){
        Map<Character, Integer> frequency = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch,0) + 1);
        }
        for (int i = 0; i < s.length(); ++i) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }



   static public char firstUniqChar(String s) {
        if (s == null || s == "") return ' ';
        if (s.length() == 1) return s.toCharArray()[0];
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int ans = -1;
        int slow = 0;
        int fast = 0;
        out: for (int i = 0; i < chars.length; i++) {
            slow = i;
            fast = i;
            char a = chars[i];
            if (set.contains(Character.valueOf(a))){
                continue;
            } else {
                set.add(a);
            }
            for (int i1 = i+1; i1 < chars.length; i1++) {
                if (a != chars[i1]){
                    fast +=1;
                }else {
                    continue;
                }
              if (fast == chars.length-1){
                    ans = slow;
                    break out;
            }
          }
        }
        return chars[ans];
    }

}
