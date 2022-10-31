class Main {
    public static void main(String[] args) {

        int[] coins = {1, 7, 10, 22};
        int sum = 49;

        Exchange exchange = new Exchange(coins, sum);

        System.out.println(
                "At least " + exchange.coinExchange(coins, sum)
                        + " coins are required to make " + "a value of " + sum
        );
    }
}