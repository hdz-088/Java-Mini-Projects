import java.util.*;

public class swap {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter A: ");
      int a = sc.nextInt();

      System.out.print("Enter B: ");
      int b = sc.nextInt();

      System.out.println("Before Swapping");
      System.out.println("Value of A: " + a);
      System.out.println("Value of B: " + b);

      int temp = a;
      a = b;
      b = temp;

      System.out.println("After Swapping");
      System.out.println("Value of A: " + a);
      System.out.println("Value of B: " + b);
    }
  }
}