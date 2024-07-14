public class binomial {

  public static int factorial(int num) {
    int fact = 1;
    while (num > 0) {
      fact *= num;
      num--;
    }
    return fact;
  }
  public static void main(String[] args) {
    int n = 5;
    int r = 2;

    int nfact = factorial(n);
    int rfact = factorial(r);
    int nminr = factorial(n-r);

    float binomial = nfact/(rfact*nminr);
    System.out.println(binomial);
  }
}
