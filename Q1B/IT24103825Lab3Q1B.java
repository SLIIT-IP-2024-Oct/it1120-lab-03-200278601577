import java.util.Scanner;

public class IT24103825Lab3Q1B{
    public static void main(String[] args){

        double pricePerKg,quantity,totalBill,discount,discountedfinalAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice:");
        pricePerKg = input.nextDouble(); 

        System.out.print("Enter the quantity (kg) you want to buy:");
        quantity = input.nextDouble();
        
        totalBill = pricePerKg * quantity;

        discount = totalBill * 0.10;

        discountedfinalAmount = totalBill - discount;

        System.out.println("\nThe total amount with 10% discount is: " + discountedfinalAmount);
        

        }
} 
