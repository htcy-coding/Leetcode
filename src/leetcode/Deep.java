package leetcode;

import java.util.LinkedList;

/**
 * @ClassName: Deep
 * @Description:  二叉树的深度（递归和非递归）
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/4 12:02
 * @Version 1.0
 */
public class Deep {


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();

        treeNode.left = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        System.out.println(findDeep(treeNode));
    }



   static public int findDeep(TreeNode root){
        int deep = 0;
        if (root != null) {
            int leftDeep =  findDeep(root.left);
            int rightDeep = findDeep(root.right);
            deep = leftDeep > rightDeep ? leftDeep+1 : rightDeep+1;
        }
        return deep;
    }












//    //递归实现1
//    public int findDeep(TreeNode root)
//    {
//        int deep = 0;
//        if(root != null) {
//            int lchilddeep = findDeep(root.left);
//            int rchilddeep = findDeep(root.right);
//            deep = lchilddeep > rchilddeep ? lchilddeep + 1 : rchilddeep + 1;
//        }
//        return deep;
//    }


    //递归实现2
    public int findDeep1(TreeNode root)
    {

        if(root == null) {
            return 0;
        }
        else {
            int lchilddeep = findDeep1(root.left);//求左子树的深度
            int rchilddeep = findDeep1(root.right);//求右子树的深度
            return lchilddeep > rchilddeep ? lchilddeep + 1 : rchilddeep + 1;//左子树和右子树深度较大的那个加一等于整个树的深度
        }
    }


    //非递归实现
    public int findDeep2(TreeNode root) {
        if (root == null)
            return 0;

        TreeNode current = null;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int cur, last;
        int level = 0;
        while (!queue.isEmpty()) {
            cur = 0;//记录本层已经遍历的节点个数
            last = queue.size();//当遍历完当前层以后，队列里元素全是下一层的元素，队列的长度是这一层的节点的个数
            while (cur < last)//当还没有遍历到本层最后一个节点时循环
            {
                current = queue.poll();//出队一个元素
                cur++;
                //把当前节点的左右节点入队（如果存在的话）
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            level++;//每遍历完一层level+1
        }
        return level;
    }


}
