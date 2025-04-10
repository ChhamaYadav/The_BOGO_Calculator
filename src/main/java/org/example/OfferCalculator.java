package org.example;

import java.util.Arrays;
import java.util.List;

public class OfferCalculator {
    public void calculates(int[] productPrices, List<Integer> payablePrices, List<Integer> freePrices) {
        Arrays.sort(productPrices); // sorting in descending order first

        //coupling the prices
        for (int i = productPrices.length - 1; i >= 0; i -= 2) {
            payablePrices.add(productPrices[i]); // Adding the highest prices in payablePrices list
            if (i - 1 >= 0) {
                freePrices.add(productPrices[i - 1]); // Adding the next highest prices in freePrices list
            }
        }
    }
}
