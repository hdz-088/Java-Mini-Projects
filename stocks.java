public class stocks {

  public static int profit(int arr[]) {
    int bprice = Integer.MAX_VALUE;
    int maxPro = 0;

    for (int i = 0; i < arr.length; i++) {
      if (bprice < arr[i]) {
        maxPro = Math.max(maxPro, (arr[i] - bprice));
      } else {
        bprice = arr[i];
      }
    }
    return maxPro;
  }

  public static void main(String[] args) {
    int stocks[] = { 7, 1, 5, 3, 6, 4 };
    int profit = profit(stocks);
    System.out.println("Profit: " + profit);
  }
}
