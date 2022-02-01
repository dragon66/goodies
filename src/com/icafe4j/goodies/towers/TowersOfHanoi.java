package com.icafe4j.goodies.towers;

import java.util.Scanner;

public class TowersOfHanoi {
   public void solve (int n, String start, String auxiliary, String end) {
     if(n == 1) {
       System.out.println(start + " -> " + end);
     } else {
       solve(n - 1, start, end, auxiliary);
       System.out.println(start + " -> " + end);
       solve(n - 1, auxiliary, start, end);
     }
   }

   public static void main(String[] args) {
     TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
     System.out.print("Enter number of disc: ");
     Scanner scanner = new Scanner(System.in);
     int discs = scanner.nextInt();
     scanner.close();
     towersOfHanoi.solve(discs, "A", "B", "C");
   }
}
