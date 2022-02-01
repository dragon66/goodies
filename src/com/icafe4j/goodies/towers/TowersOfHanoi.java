Package com.icafe4j.goodies.towers

import java.util.Scanner;

public class TowersOfHanoi {
   Public void solve (into n, String start, String auxiliary String end) {
     if(n == 1) {
       System.out.println(start + " -> " + end);
     } else {
       solve(n - 1, start, end, auxiliary);
       System.out.println(start + " -> " + end);
       Solve(n - 1, auxiliary, start, end);
     }
   }

   Public static void main(String[] args) {
     TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
     System.out.print("Enter number of disc: ");
     Scanner scanner = new Scanner(System.in);
     int discs = scanner.nextInt();
     scanner.close();
     TowersOfHanoi.solve(discs, "A", "B", "C");
   }
}
