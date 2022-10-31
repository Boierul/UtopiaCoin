/**
 * Class that imitates the functionality of a currency exchange
 *
 * @author Boierul
 */
public class Exchange {
    /**
     * Field array with all the permitted coins
     */
    private final int[] allowedCoins;

    public Exchange(int[] allowedCoins, int sumToBeExchanged) {
        this.allowedCoins = allowedCoins;
    }

    /**
     * Size validator method
     *
     * @return the current size of the permitted coins
     */
    public int getCoinsSize() {
        return allowedCoins.length;
    }

    /**
     * Method which computes the distribution of coins
     *
     * @param coins array of all the permitted coins
     * @param sum   the amount of coins to be exchanged
     * @return the min number coins needed to exchange the indicated sum
     */
    public int coinExchange(int[] coins, int sum) {
        int totalCoins = getCoinsSize();

        if (totalCoins == 0) {
            return 0;
        }

        /* Creating array which stores sub-problems' solutions */
        double[][] arr = new double[totalCoins + 1][sum + 1];

        /* Initialising first row with +ve infinity */
        for (int j = 0; j <= sum; j++) {
            arr[0][j] = Double.POSITIVE_INFINITY;
        }

        /* Initialising first column with 0 */
        for (int i = 1; i <= totalCoins; i++) {
            arr[i][0] = 0;
        }

        /* Implementing the recursive solution */
        for (int i = 1; i <= totalCoins; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coins[i - 1] <= j) {
                    arr[i][j] = min(1 + arr[i][j - coins[i - 1]], arr[i - 1][j]);
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
        return (int) arr[totalCoins][sum];
    }

    /**
     * Method that checks the minimum between 2 numbers
     *
     * @param numberOne the first comparable number
     * @param numberTwo the second comparable number
     * @return the smallest number
     */
    private double min(double numberOne, double numberTwo) {
        return Math.min(numberOne, numberTwo);
    }
}
