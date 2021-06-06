package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Brianne Juntunen
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double subtotal = myApp.promptAmount();
        String state = myApp.promptState();
        double tax = 0;

        if(state.equals("WI")){
            tax = myApp.calculateTax(subtotal);
        }

        double total = myApp.calculateTotal(subtotal, tax);

        myApp.printOutput(subtotal, tax, total);
    }

    public void printOutput(double subtotal, double tax, double total){
        System.out.printf("The subtotal is $%.2f.\n" +
                "The tax is $%.2f.\n" +
                "The total is $%.2f.",
                subtotal, tax, total);
    }

    public double calculateTax(double subtotal){
        return subtotal * 0.055; //5.5%
    }

    public double calculateTotal(double subtotal, double tax){
        return subtotal + tax;
    }

    public double promptAmount(){
        System.out.print("What is the order amount? ");
        return Double.parseDouble(in.nextLine());
    }

    public String promptState(){
        System.out.print("What is the state? ");
        return in.nextLine();
    }
}
