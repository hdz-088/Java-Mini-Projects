import java.util.*;

public class decTObin {

  public static int decBin(int decNum) {
    int pow = 0;
    int bin = 0;
    while (decNum > 0) {
      int temp = decNum % 2;
      bin += temp * Math.pow(10, pow);
      pow++;
      decNum /= 2;
    }
    return bin;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter Decimal Num: ");
      int num = sc.nextInt();

      System.out.println("Binary Number: "+decBin(num));
    }
  }
}
