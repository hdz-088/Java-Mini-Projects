
// Getting an input from user and check wether the number is positive or negative
import java.util.*;

/*
 * Title: Program to check whether the number inputed by user is positive or negative
 * Author: HDz (https://github.com/hdz-088/)
 * Date of Creation: 10/07/2024
 * Last Update: 10/07/2024
 */

public class negpos {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter Your Number: ");
      int num = sc.nextInt();

      if (num > 0)
        System.out.println("Your Number is Positive");
      else
        System.out.println("Your Number is Negative");
    }
  }
}