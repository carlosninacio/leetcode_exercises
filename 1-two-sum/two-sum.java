class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solucion = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int primerNumero = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int segundoNumero = nums[j];
                if (primerNumero + segundoNumero == target) {
                    solucion[0] = i;
                    solucion[1] = j;
                }
            }
        }
        return solucion;
    }
}