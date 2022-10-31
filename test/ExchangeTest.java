import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExchangeTest {

    @Test
    public void minOfCoinsNoCoins() {
        int[] coins = {};
        int sum = 49;

        Exchange exchange = new Exchange(coins, sum);
        assertEquals(0, exchange.coinExchange(coins, sum));
    }

    @Test
    public void minOfCoinsWithOneCoin_1() {
        int[] coins = {1};
        int sum = 49;

        Exchange exchange = new Exchange(coins, sum);
        assertEquals(49, exchange.coinExchange(coins, sum));
    }

    @Test
    public void minOfCoinsWithTwoCoins_1_2_sum_49() {
        int[] coins = {1, 5};
        int sum = 25;

        Exchange exchange = new Exchange(coins, sum);
        assertEquals(5, exchange.coinExchange(coins, sum));
    }

    @Test
    public void minOfCoinsWithTwoCoins_1_5_sum_49() {
        int[] coins = {1, 5};
        int sum = 49;

        Exchange exchange = new Exchange(coins, sum);
        assertEquals(13, exchange.coinExchange(coins, sum));
    }


    @Test
    public void minOfCoinsWithUtopianCoins_1_7_10_22_sum_49() {
        int[] coins = {1, 7, 10, 22};
        int sum = 49;

        Exchange exchange = new Exchange(coins, sum);
        assertEquals(4, exchange.coinExchange(coins, sum));
    }

    @Test
    public void totalOfCoinsWithUtopianCoins_1_7_10_22_sum_13() {
        int[] coins = {1, 7, 10, 22};
        int sum = 13;

        Exchange exchange = new Exchange(coins, sum);
        assertEquals(4, exchange.coinExchange(coins, sum));
    }

    @Test
    public void totalOfCoinsWithUtopianCoins_1_7_10_22_sum_215() {
        int[] coins = {1, 7, 10, 22};
        int sum = 215;

        Exchange exchange = new Exchange(coins, sum);
        assertEquals(11, exchange.coinExchange(coins, sum));
    }

    @Test
    public void minOfCoinsWithUSCoins_sum_49() {
        int[] coins = {1, 5, 10, 25, 50};
        int sum = 49;

        Exchange exchange = new Exchange(coins, sum);
        assertEquals(7, exchange.coinExchange(coins, sum));
    }


    @Test
    public void minOfCoinsWithUSCoins_sum_13() {
        int[] coins = {1, 5, 10, 25, 50};
        int sum = 13;

        Exchange exchange = new Exchange(coins, sum);
        assertEquals(4, exchange.coinExchange(coins, sum));
    }

    @Test
    public void minOfCoinsWithUSCoins_sum_215() {
        int[] coins = {1, 5, 10, 25, 50};
        int sum = 215;

        Exchange exchange = new Exchange(coins, sum);
        assertEquals(6, exchange.coinExchange(coins, sum));
    }
}
