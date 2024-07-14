import java.util.*;

public class prime_range {

  public static boolean isPrime(int n) {
    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        isPrime = false;
    }
    return isPrime;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Start: ");
      int start = sc.nextInt();

      System.out.print("End: ");
      int end = sc.nextInt();

      // Linear Output
      // for (int i = start; i <= end; i++) {
      //   String output = isPrime(i) ? (i + " is a Prime Number") : (i + " is a Composite Number");
      //   System.out.println(output);
      // }

      // Tabular Output
      String prime = "Prime Num: ";
      String comp = "Composite Num: ";

      for (int i = start; i <= end; i++) {
        if (isPrime(i)){
          prime += i+" ";
        } else {
          comp += i+" ";
        }
      }
      System.out.println(prime);
      System.out.println(comp);
    }
  }
}
