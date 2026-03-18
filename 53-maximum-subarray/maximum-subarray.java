class Solution {
    public int maxSubArray(int[] nums) {
        int sumaActual = 0;
        int sumaMayor = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (sumaActual < 0) {
                sumaActual = 0;
            }
            sumaActual += nums[i];
            if (sumaActual > sumaMayor) {
                sumaMayor = sumaActual;
            }
        }
        return sumaMayor;
    }
}