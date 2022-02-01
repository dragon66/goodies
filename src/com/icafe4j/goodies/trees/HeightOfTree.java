package com.icafe4j.goodies.trees;

public class HeightOfTree {

   public static void main(String[] args) {
      TreeNode root = new TreeNode();
      root.left = new TreeNode();
      root.left.left = new TreeNode();
      root.left.left.left = new TreeNode();
      root.right = new TreeNode();
      System.out.println(depth(root));
   }

   public static int depth(TreeNode root) {
      if(root == null)
         return -1;
      int lChildH = depth(root.left);
      int rChildH = depth(root.right);
      if(lChildH > rChildH) return 1 + lChildH;
      return 1 + rChildH;
   }
}
