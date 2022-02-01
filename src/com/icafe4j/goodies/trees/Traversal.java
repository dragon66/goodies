package com.icafe4j.goodies.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class Traversal {

   public static void main(String[] args) {
      TreeNode root = new TreeNode("A");
      root.left = new TreeNode("B");
      root.left.left = new TreeNode("C");
      root.left.left.left = new TreeNode("D");
      root.left.left.left.right = new TreeNode("E");
      root.right = new TreeNode("F");
      System.out.println("Depth First --- ");
      depthFirst(root);
      Queue<TreeNode> queue = new ArrayDeque<>();
      queue.offer(root);
      System.out.println("Breadth First --- ");
      breadthFirst(queue);
   }

   private static void depthFirst(TreeNode root) {
      if(root != null) {
         System.out.println(root.name);
         depthFirst(root.left);
         depthFirst(root.right);
      }
   }

   private static void breadthFirst(Queue<TreeNode> queue) {
      while(queue.size() > 0) {
         TreeNode node = queue.poll();
         System.out.println(node.name);
         if(node.left != null)
            queue.offer(node.left);
         if(queue.right != null)
            queue.offer(node.right);
      }
   }


      
