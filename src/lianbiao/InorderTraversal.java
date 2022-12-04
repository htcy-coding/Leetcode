package lianbiao;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: InorderTraversal
 * @Description:
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/1 00:49
 * @Version 1.0
 */
public class InorderTraversal {

    // SimpleDateFormat 不是线程安全的，所以每个线程都要有自己独立的副本
    private static final ThreadLocal<String> formatter = ThreadLocal.withInitial(() -> new String("yyyyMMdd HHmm"));



    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        formatter.set("");
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.value);
        inorder(root.right, res);
    }




}

