import java.util.Scanner;

public class IT24103825Lab3Q1A{
    public static void main(String[] args){

        double pricePerKg,quantity,totalAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice:");
        pricePerKg = input.nextDouble(); 

        System.out.print("Enter quantity of kilogram:");
        quantity = input.nextDouble();

        totalAmount = pricePerKg * quantity;

        System.out.printf("The total amount is: " + totalAmount);
        

        }
} 
