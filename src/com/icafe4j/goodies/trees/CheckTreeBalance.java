package com.icafe4j.goodies.trees;

public class CheckTreeBalance {
   
   public static void main( String[] args) {
      TreeNode root = new TreeNode();
      root.left = new TreeNode();
      root.left.left = new TreeNode();
      root.right = new TreeNode();
      System.out.println(depth(root));
      System.out.println(is balanced(root));
   }

   public static boolean isBalanced(TreeNode root) {
      return depth(root) != -1; // -1 means not balanced
   }

   public static int depth(TreeNode root) {
      if(root == null)
         return 0; // see note
      int lChildH = depth(root.left);
      if(lChildH == -1) return -1;
      int rChildH = depth(root.right);
      if(rChildH == -1) return -1;
      if(lChildH != rChildH) return -1;
      return 1 + lChildH; // lChildH == rChildH
   }
}
