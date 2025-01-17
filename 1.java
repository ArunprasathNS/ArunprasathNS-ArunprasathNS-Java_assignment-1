public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            
            int width = right - left;
            int heightMin = Math.min(height[left], height[right]);

            int currentArea = width * heightMin;
            
            maxArea = Math.max(maxArea, currentArea);
            
           
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height1)); 

        int[] height2 = {1, 1};
        System.out.println(maxArea(height2));  
    }
}
