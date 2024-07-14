import java.util.*;

public class greetings {

  public static void greet(String name) {
    System.out.println("Hello, " + name);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter Name: ");
      String name = sc.nextLine();

      greet(name);
    }
  }
}
