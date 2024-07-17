public class kadane {

  public static void maxSubSum(int arr[]) {
    int sum = 0;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum < 0) {
        sum = 0;
      }
      max = Math.max(max, sum);
    }
    if (max == 0) {
      max = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
          max = arr[i];
        }
      }
    }
    System.out.println("Max Sub-Array Sum: " + max);
  }

  public static void main(String[] args) {
    // int numbers[] = {2,-3,4,-1,-2,1,5,-3};
    int numbers[] = { -1, -2, -3 };
    maxSubSum(numbers);
  }
}
