
/*
 * Title: Program to find factorial of a positive integer
 * Author: HDz (https://github.com/hdz-088/)
 * Date of Creation: 10/07/2024
 * Last Update: 10/07/2024
 */
import java.util.*;

public class factorial {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter Number: ");
      int num = sc.nextInt();
      
      int fact = 1;
      while (num > 0) {
        fact *= num;
        num--;
      }
      System.out.println(fact);
    }
  }
}
