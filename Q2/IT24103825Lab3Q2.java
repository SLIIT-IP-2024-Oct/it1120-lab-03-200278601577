import java.util.Scanner;

public class IT24103825Lab3Q2{
    public static void main(String[] args){

        double monthlySalary,otHour,otRate,otAmount,totalSalary;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly salary:");
        monthlySalary = input.nextDouble(); 

        System.out.print("Enter the number of OT hours:");
        otHour = input.nextDouble();

        System.out.print("Enter the OT hourly rate:");
        otRate = input.nextDouble();
        
        otAmount = otHour * otRate;

        totalSalary = monthlySalary + otAmount;

        System.out.println("The total salary including OT is: " + totalSalary);
        
        }
} 