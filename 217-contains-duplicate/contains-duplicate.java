class Solution {
    public boolean containsDuplicate(int[] nums) {
        Boolean seRepite = false;
        HashSet<Integer> numeros = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numeros.contains(nums[i])) {
                seRepite = true;
                break;
            } else {
                numeros.add(nums[i]);
            }
        }
        return seRepite;
    }
}