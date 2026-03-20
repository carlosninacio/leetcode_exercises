class Solution {
    public int findMin(int[] nums) {
        int resultado = nums[0];
        for (int i = 0; i < nums.length; i++) {
            resultado = Math.min(resultado, nums[i]);
        }
        return resultado;
    }
}