class Solution {
    public int maxProduct(int[] nums) {
        int maxActual = nums[0];
        int minActual = nums[0];
        int resultado = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                int temp = maxActual;
                maxActual = minActual;
                minActual = temp;
            }

            maxActual = Math.max(num, maxActual * num);
            minActual = Math.min(num, minActual * num);

            resultado = Math.max(resultado, maxActual);
        }

        return resultado;
    }
}