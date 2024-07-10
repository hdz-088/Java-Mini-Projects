/*
 * Title: Program to reverse a given number and store it inside a variable
 * Author: HDz (https://github.com/hdz-088/)
 * Date of Creation: 10/07/2024
 * Last Update: 10/07/2024
 */

public class reverse_num2 {
  public static void main(String[] args) {
    int n = 2930212;
    int temp = 0;
    while(n > 0){
      temp += n % 10;
      n /= 10;
      temp *= 10;
    }
    System.out.println(temp/10);
  }
}
