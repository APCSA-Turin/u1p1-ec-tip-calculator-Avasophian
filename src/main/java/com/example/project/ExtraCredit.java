package com.example.project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;
// I learned how to round with https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/


public class ExtraCredit
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    // I learned how to round with https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
   
    public static String calculateTip(int people, int percent, double cost, String items) 
        {
        StringBuilder result = new StringBuilder();
        
        double percentasDecimal = (double)percent/100.0;
        double tip = percentasDecimal * cost;
        double newCost = tip + cost;
        double individualCost = (cost/people);
        double individualTip = (tip/people);
        double totalPersonCost = (newCost/people);
    
    
    
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + df.format(tip) + "\n");
        result.append("Total Bill with tip: $" + df.format(newCost) + "\n");
        result.append("Per person cost before tip: $" + df.format(individualCost) + "\n");
        result.append("Tip per person: $" + df.format(individualTip) + "\n");
        result.append("Total cost per person: $" + df.format(totalPersonCost) + "\n");
        result.append("-------------------------------\n");
    
        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);
        return result.toString();
        }
        
                                   
    public static void main(String[] args) {
        int people = 3; 
        int percent = 25;
        double cost = 25.99; 
        String items = ""; 

        Scanner scan = new Scanner(System.in);
        String newFood = "";
    
        while (!newFood.equals("-1"))
        // https://stackoverflow.com/questions/22992746/string-comparison-doesnt-work-in-while-loop
        {
            System.out.print("Enter an item name or type -1 to finish: ");
            newFood = scan.nextLine();
            if (newFood.equals("-1"))
            {
                break;
            }
            items = (items + newFood + "\n");
        }
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
