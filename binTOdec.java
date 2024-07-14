import java.util.*;

public class binTOdec {

  public static int binDec(int binNum) {
    int pow = 0;
    int decNum = 0;

    while (binNum > 0) {
      int last = binNum % 10;
      decNum += (last * Math.pow(2, pow));
      pow++;
      binNum /= 10;
    }
    return decNum;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter Binary Number: ");
      int num = sc.nextInt();

      System.out.println("Decimal: " + binDec(num));
    }
  }
}
