package leetcode.bd;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: HasPathSum
 * @Description:
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。
 * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。如果存在，返回 true ；否则，返回 false 。
 *
 * 叶子节点 是指没有子节点的节点。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/24 18:53
 * @Version 1.0
 */
public class HasPathSum {


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();

        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();
        treeNode.value = 1;
        treeNode2.value = 2;
        treeNode3.value = 3;
        treeNode4.value = 4;
        treeNode.left = treeNode2;
        treeNode.right = treeNode3;
        treeNode2.right = treeNode4;

        hasPathSum(treeNode,10);
    }

   static public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        List<Integer> list = new ArrayList();
        hasnum(root,0,list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return false;
    }


   static int hasnum(TreeNode root, int val, List<Integer> list){
        if (root != null) {
            if (root.left == null && root.right == null){
               list.add(val+root.value);
            }else {
                hasnum(root.left,root.left.value,list);
                hasnum(root.right,root.right.value, list);
            }
        }
       return 0;
    }


    public boolean hasPathSum1(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.value;
        }
        return hasPathSum(root.left, sum - root.value) || hasPathSum(root.right, sum - root.value);
    }



}
