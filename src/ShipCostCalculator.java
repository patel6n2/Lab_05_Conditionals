import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double price = 0;
        double shippingCost = 0;
        double totalCost = 0;
        String trash = "";

        System.out.print("Enter the price: ");
        if (in.hasNextDouble())
        {
            price = in.nextDouble();
            in.nextLine();
            if (price >= 100)
            {
                shippingCost = 0;
            }
            else
            {
                shippingCost = .02 * price;
            }
            totalCost = price + shippingCost;
            System.out.println("The shipping cost is $" + shippingCost);
            System.out.println("The total cost is $" + totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said the price is " + trash);
            System.out.println("Run the program again with correct input values.");
        }
    }
}