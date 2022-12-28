package leetcode;

/**
 * @ClassName: IsBalanced
 * @Description: https://leetcode.cn/problems/balanced-binary-tree/
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：  1
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/4 13:41
 * @Version 1.0
 */
public class IsBalanced {





    public boolean isBalanced1(TreeNode root) {
        if (root != null) {
            return  (Math.abs(height1(root.left) - height1(root.right)) <= 1 && isBalanced(root.right) && isBalanced(root.left));
        }else {
            return true;
        }
    }

    public int height1(TreeNode root) {
        if (root != null){
            return Math.max(height1(root.left),height1(root.right))+1;
        }else {
            return 0;
        }
    }


    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

}
