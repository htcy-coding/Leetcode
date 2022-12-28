package leetcode.bd;

import leetcode.TreeNode;

/**
 * @ClassName: LowestCommonAncestor
 * @Description: https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/24 16:51
 * @Version 1.0
 */
public class LowestCommonAncestor {

    private TreeNode ans;

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        if ((lson && rson) || ((root.value == p.value || root.value == q.value) && (lson || rson))) {
            ans = root;
        }
        return lson || rson || (root.value == p.value || root.value == q.value);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }

}
