/*
 * Title: Program to take a number as input from user and print multiplication table of that number
 * Author: HDz (https://github.com/hdz-088/)
 * Date of Creation: 10/07/2024
 * Last Update: 10/07/2024
 */

import java.util.*;

public class multiplication_table {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int num = sc.nextInt();

      for(int i = 1; i <= 10; i++){
        System.out.println(num + " * " + i +" = " + num*i);
      }
    }
  }
}
