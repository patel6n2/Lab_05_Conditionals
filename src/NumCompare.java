import java.util.Scanner;

public class NumCompare
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double firstNum = 0;
        double secondNum = 0;
        String trash = "";

        System.out.print("Enter the first number: ");
        if (in.hasNextDouble())
        {
            firstNum = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Run the program again with correct input values.");
        }

        System.out.print("Enter the second number: ");
        if (in.hasNextDouble())
        {
            secondNum = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Run the program again with correct input values.");
        }

        if (firstNum == secondNum)
        {
            System.out.println("The numbers are equal.");
        }
        else if (firstNum < secondNum)
        {
            System.out.println("The numbers are not equal. " + firstNum + " is the smaller number.");
        }
        else
        {
            System.out.println("The numbers are not equal. " + secondNum + " is the smaller number.");
        }
    }
}