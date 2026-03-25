class Solution {
    public int maxArea(int[] height) {
        int max = 0; int left = 0; int right = height.length - 1;
        while (right > left) {
            int base = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = base * minHeight;
            max = Math.max(max,area);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}