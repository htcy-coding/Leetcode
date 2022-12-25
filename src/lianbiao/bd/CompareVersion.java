package lianbiao.bd;

/**
 * @ClassName: CompareVersion
 * @Description:
 * 给你两个版本号 version1 和 version2 ，请你比较它们。
 *
 * 版本号由一个或多个修订号组成，各修订号由一个 '.' 连接。每个修订号由 多位数字 组成，可能包含 前导零 。每个版本号至少包含一个字符。修订号从左到右编号，
 * 下标从 0 开始，最左边的修订号下标为 0 ，下一个修订号下标为 1 ，以此类推。例如，2.5.33 和 0.1 都是有效的版本号。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/compare-version-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/24 19:20
 * @Version 1.0
 */
public class CompareVersion {

    public int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        for (int i=0; i< v1.length || i< v2.length; i++){
            int vi1 = 0, vi2 = 0;
            if (i < v1.length) {
                 vi1 = Integer.parseInt(v1[i]);
            }
            if (i < v2.length) {
                 vi2 = Integer.parseInt(v2[i]);
            }
            if (vi1 > vi2){
                return 1;
            }
            if (vi1 < vi2) {
                return -1;
            }
        }
        return 0;
    }


        static public int compareVersion2(String version1, String version2) {
            int n = version1.length(), m = version2.length();
            int i = 0, j = 0;
            while (i < n || j < m) {
                int x = 0;
                for (; i < n && version1.charAt(i) != '.'; ++i) {
                    x = x * 10 + version1.charAt(i) - '0';
                }
                ++i; // 跳过点号
                int y = 0;
                for (; j < m && version2.charAt(j) != '.'; ++j) {
                    y = y * 10 + version2.charAt(j) - '0';
                }
                ++j; // 跳过点号
                if (x != y) {
                    return x > y ? 1 : -1;
                }
            }
            return 0;
        }



}
