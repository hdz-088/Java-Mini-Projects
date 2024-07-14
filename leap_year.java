/*
 * Title: Program to take a year as input from user and find wether its leap year or not
 * Author: HDz (https://github.com/hdz-088/)
 * Date of Creation: 10/07/2024
 * Last Update: 10/07/2024
 */

import java.util.*;

public class leap_year {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a Year: ");
      int year = sc.nextInt();

      if (year % 4 == 0) {
        if (year % 100 == 0) {
          if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
          } else {
            System.out.println(year + " is not a Leap Year");
          }
        } else {
          System.out.println(year + " is a Leap Year");
        }
      } else {
        System.out.println(year + " is not a Leap Year");
      }
    }
  }
}