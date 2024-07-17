public class subArrays {

  public static void sumSubArr(int array[]) {
    int ts = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      System.out.println("Subarrays of " + array[i] + ":");
      for (int j = i; j < array.length; j++) {
        int sum = 0;
        System.out.print("{");
        for (int k = i; k <= j; k++) {
          System.out.print(" " + array[k] + " ");
          sum += array[k];
        }
        System.out.print("}");
        System.out.println(" = " + sum);
        if (sum > max) {
          max = sum;
        }
        if (sum < min) {
          min = sum;
        }
        ts++;
      }
      System.out.println();
    }
    System.out.println("Min Sum: " + min);
    System.out.println("Max Sum: " + max);
    System.out.println("Total Sub Arrays: " + ts);
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    sumSubArr(numbers);
  }
}

// Find sum of each sub-arrays and find the max and min sum