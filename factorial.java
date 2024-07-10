/*
 * Title: Program to find factorial of a positive integer
 * Author: HDz (https://github.com/hdz-088/)
 * Date of Creation: 10/07/2024
 * Last Update: 10/07/2024
 */

public class factorial {
  public static void main(String[] args) {
    int num = 12;
    int fact = 1;
    while(num > 0){
      fact *= num;
      num--;
    }
    System.out.println(fact);
  }
}
