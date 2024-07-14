import java.util.*;

public class calculator {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter Num-1: ");
      float num1 = sc.nextFloat();

      System.out.print("Enter Operator (+, -, *, /): ");
      String op = sc.next();

      System.out.print("Enter Num-2: ");
      float num2 = sc.nextFloat();

      switch (op) {
        case "+":
          System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
          break;
        case "-":
          System.out.println("Substraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
          break;
        case "*":
          System.out.println("Multiplication: " + num1 + " x " + num2 + " = " + (num1 * num2));
          break;
        case "/":
          System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
          break;
        default:
          System.out.println("Invalid Input");
          break;
      }
    }
  }
}
