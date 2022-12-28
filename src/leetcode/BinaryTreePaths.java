package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: BinaryTreePaths
 * @Description:二叉树的所有路径   1
 * 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 *
 * 叶子节点 是指没有子节点的节点。
 * https://leetcode.cn/problems/binary-tree-paths/
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/12/4 13:13
 * @Version 1.0
 */
public class BinaryTreePaths {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();

        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();
        treeNode.value = 7;
        treeNode2.value = 6;
        treeNode3.value = 9;
        treeNode4.value = 5;

        treeNode.left = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        System.out.println(binaryTreePaths(treeNode).size());
        for (int i = 0; i < binaryTreePaths(treeNode).size(); i++) {
            System.out.println(binaryTreePaths(treeNode).get(i));
        }
    }


  static   public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        constructPaths(root, "", paths);
        return paths;
    }

   static public void constructPaths(TreeNode root, String path, List<String> paths) {
       if (root != null){
           StringBuilder stringBuilder = new StringBuilder(path);
           stringBuilder.append(root.value);
           if(root.left == null && root.right ==null){
               paths.add(stringBuilder.toString());
           }else {
               stringBuilder.append("->");
               constructPaths(root.left,stringBuilder.toString(),paths);
               constructPaths(root.right,stringBuilder.toString(),paths);
           }
       }
    }


//  static   public void constructPaths(TreeNode root, String path, List<String> paths) {
//        if (root != null) {
//            StringBuffer pathSB = new StringBuffer(path);
//            pathSB.append(Integer.toString(root.value));
//            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
//                paths.add(pathSB.toString());  // 把路径加入到答案中
//            } else {
//                pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
//                constructPaths(root.left, pathSB.toString(), paths);
//                constructPaths(root.right, pathSB.toString(), paths);
//            }
//        }
//    }



}
