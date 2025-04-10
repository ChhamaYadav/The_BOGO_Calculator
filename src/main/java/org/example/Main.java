package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//For only printing input and output
public class Main {
    public static void main(String[] args) {

        //Input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the prices of Items with spaces: ");
        String[] input = scanner.nextLine().trim().split("\\s+");

//        //Checking edge cases
//        if(product_prices.length==0){
//            System.out.println("Please enter valid prices");
//            return;
//        }

        int[] product_prices = new int[input.length];

        //Converting the input into an array
        for (int i = 0; i < input.length; i++) {
            product_prices[i] = Integer.parseInt(input[i]);
        }

        //Lists for storing payable and free prices seperately
        List<Integer> payable_prices = new ArrayList<>();
        List<Integer> free_prices = new ArrayList<>();

        //Creating instance to call calculates method
        OfferCalculator offerCalculator = new OfferCalculator();
        offerCalculator.calculates(product_prices, payable_prices, free_prices);

        //Printing the results
        System.out.println("Payable prices of the Items: " + payable_prices);
        System.out.println("Discounted prices of the Items: " + free_prices);


    }
}