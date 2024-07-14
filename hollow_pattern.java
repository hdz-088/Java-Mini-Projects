public class hollow_pattern {
  public static void main(String[] args) {
    int h = 4;
    int w = 5;
    for (int i = 0; i <= h; i++) {
      if (i == 0 || i == h) {
        for (int j = 0; j < w; j++) {
          System.out.print("*");
        }
        System.out.println();
      } else {
        for (int j = 0; j <= w; j++) {
          if (j > 0 & j < (w - 1)) {
            System.out.print(" ");
          } else if (j == 0 || j == (w - 1)) {
            System.out.print("*");
          }
        }
        System.out.println();
      }
    }
  }
}