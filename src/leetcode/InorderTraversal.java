package leetcode;

import java.util.*;

/**
 * @ClassName: InorderTraversal
 * @Description: 中序遍历
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/1 00:49
 * @Version 1.0
 */
public class InorderTraversal {


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }


    // 递归解法  前序
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        preOrder(root, res);
        return res;
    }

    //递归 前序
    private void preOrder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        res.add(node.value);
        preOrder(node.left, res);
        preOrder(node.right, res);
    }

    //中序
    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        inorder(root.left, res);
        res.add(root.value);
        inorder(root.right, res);
    }

    //后序
    public void postorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.value);
    }

    // 迭代解法 前序
    public List<Integer> preorderTraversal1(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            res.add(curr.value);
            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);
        }
        return res;
    }


    //迭代
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();


        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.value);
            root = root.right;
        }

        return res;
    }




    //迭代 后序
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode prev = null;


        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                res.add(root.value);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }


        return res;
    }


}

