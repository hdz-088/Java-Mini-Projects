import java.util.*;

public class prime_num {

  public static boolean isPrime(int n){
    boolean isPrime = true;
    for (int i=2; i<=Math.sqrt(n); i++){
      if(n % i == 0) isPrime = false;
    } 
    return isPrime;
  }

  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
      System.out.print("Enter Number: ");
      int n = sc.nextInt();

      String output = isPrime(n) ? (n+" is a Prime Number") : (n+" is a Composite Number");

      System.out.println(output);
    }
  }  
}
