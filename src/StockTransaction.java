/******************************************************************
 * Stock Transaction Program                                      *
 * This program calculates the profit or loss from a stock        *
 * transaction, including broker commissions for both purchase    *
 * and sale. It displays the detailed breakdown of the costs.     *
 ******************************************************************/

public class StockTransaction {

    /**************************************************************
     * Main Method                                                *
     * Calculates the total costs, broker commissions, and net    *
     * profit or loss from the stock transaction.                 *
     **************************************************************/
    public static void main(String[] args) {

        //*********************************************************
        // Constant Declarations                                  *
        // Fixed values representing share prices and commission  *
        //*********************************************************
        final int NUMBER_OF_SHARES = 1000;           // Shares purchased and sold
        final double PURCHASE_PRICE_PER_SHARE = 32.87; // Purchase price per share
        final double SALE_PRICE_PER_SHARE = 33.92;    // Sale price per share
        final double COMMISSION_RATE = 0.02;          // 2% commission rate

        //*********************************************************
        // Variable Declarations                                  *
        // To store calculated values                             *
        //*********************************************************
        double amountPaidForStock;                // Total amount paid for the stock
        double purchaseCommission;                // Commission for the purchase
        double amountReceivedFromSale;            // Total amount received from the sale
        double saleCommission;                    // Commission for the sale
        double profitOrLoss;                      // Net profit or loss

        //*********************************************************
        // Calculation Section                                    *
        // Compute the amounts for stock transactions             *
        //*********************************************************
        amountPaidForStock = NUMBER_OF_SHARES * PURCHASE_PRICE_PER_SHARE;
        purchaseCommission = amountPaidForStock * COMMISSION_RATE;
        amountReceivedFromSale = NUMBER_OF_SHARES * SALE_PRICE_PER_SHARE;
        saleCommission = amountReceivedFromSale * COMMISSION_RATE;
        profitOrLoss = (amountReceivedFromSale - saleCommission) - (amountPaidForStock + purchaseCommission);

        //*********************************************************
        // Output Section                                         *
        // Display the breakdown of costs and profit/loss         *
        //*********************************************************
        System.out.println();
        System.out.printf("%-40s $%.2f\n", "Amount Paid for the Stock:", amountPaidForStock);
        System.out.printf("%-40s $%.2f\n", "Purchase Commission (2%):", purchaseCommission);
        System.out.printf("%-40s $%.2f\n", "Amount Received from Sale:", amountReceivedFromSale);
        System.out.printf("%-40s $%.2f\n", "Sale Commission (2%):", saleCommission);
        System.out.printf("%-40s $%.2f\n", "Net Profit/Loss:", profitOrLoss);

        //*********************************************************
        // Developer Credit                                       *
        //*********************************************************
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov");

        //*********************************************************
        // Program End                                            *
        //*********************************************************
        System.exit(0);
    }
}

