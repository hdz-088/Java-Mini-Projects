public class trappingRainwater {

  public static int waterVol(int height[]) {
    int n = height.length;
    // Calculate Left Max Boundary
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    // Calculate Right Max Boundary
    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n - 1];
    for (int i = n-2; i >= 0; --i) {
      rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    // Calculate Water Level
    int water = 0;
    int wl = 0;
    for(int i=0; i<n; i++){
      wl = Math.min(leftMax[i], rightMax[i]);
      water += wl-height[i];
    }


    return water;
  }

  public static void main(String[] args) {
    int height[] = {4,2,0,6,3,2,5};
    int water = waterVol(height);
    System.out.println("Trapped Water: "+water);
  }
}
