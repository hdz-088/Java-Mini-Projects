/*
 * Title: Program to reverse a given number and print it
 * Author: HDz (https://github.com/hdz-088/)
 * Date of Creation: 10/07/2024
 * Last Update: 10/07/2024
 */

public class reverse_num_print {
  public static void main(String[] args) {
    int n = 10899;
    int temp = 0;
    while(n > 0){
      temp = n % 10;
      n /= 10;
      System.out.print(temp);
    }
    System.out.println();
  }
}
