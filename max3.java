import java.util.*;

public class max3 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter Num-1: ");
      int num1 = sc.nextInt();

      System.out.print("Enter Num-2: ");
      int num2 = sc.nextInt();

      System.out.print("Enter Num-3: ");
      int num3 = sc.nextInt();

      if (num1 > num2 && num1 > num3) {
        System.out.println(num1 + " is biggest");
      } else if (num2 > num3) {
        System.out.println(num2 + " is biggest");
      } else {
        System.out.println(num3 + " is biggest");
      }
    }
  }
}