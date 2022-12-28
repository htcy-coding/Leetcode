package leetcode.bd;

import leetcode.TreeNode;

/**
 * @ClassName: IsSymmetric
 * @Description: https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof/
 * 对称的二叉树
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/24 19:10
 * @Version 1.0
 */
public class IsSymmetric {

//    public boolean isSymmetric(TreeNode root) {
//        if (root != null){
//            return ((root.left.value) == (root.right.value) && isSymmetric(root.left) && isSymmetric(root.right));
//        }
//        return false;
//    }

        public boolean isSymmetric2(TreeNode root) {
            return check(root, root);
        }

        public boolean check(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null) {
                return false;
            }
            return p.value == q.value && check(p.left, q.right) && check(p.right, q.left);
        }

}
