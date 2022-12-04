package lianbiao;

/**
 * @ClassName: KthLargest
 * @Description: 二叉搜索树的第k大节点
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/1 00:28
 * @Version 1.0
 */
public class KthLargest {

    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(k == 0) return;
        if(--k == 0) res = root.value;
        dfs(root.left);
    }


}
