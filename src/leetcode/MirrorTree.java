package leetcode;

/**
 * @ClassName: MirrorTree
 * @Description:二叉树的镜像   1
 * https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/11/30 00:23
 * @Version 1.0
 */
public class MirrorTree {


    //递归
    public TreeNode mirrorTree1(TreeNode root) {
        if (root == null) return null;
        TreeNode left = mirrorTree1(root.left);
        TreeNode right = mirrorTree1(root.right);
        root.left = right;
        root.right = left;
        return root;
    }









    //递归
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right  = left;
        return root;
    }
}
