class Solution {
    public int maxProfit(int[] prices) {
        int minPrecio = Integer.MAX_VALUE;
        int maxGanancia = 0;

        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrecio) {
                minPrecio = prices[i];
            } else {
                int ganancia = prices[i] - minPrecio;
                if (ganancia > maxGanancia) {
                    maxGanancia = ganancia;
                }
            }
        }
        return maxGanancia;
    }
}