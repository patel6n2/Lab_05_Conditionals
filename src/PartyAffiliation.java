import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party = "";

        System.out.print("Enter your party affiliation [D, R, I]: ");
        party = in.nextLine();

        if (party.equals("D") || party.equals("d"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (party.equals("R") || party.equals("r"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (party.equals("I") || party.equals("i"))
        {
            System.out.println("You get an Independent Man.");
        }
        else
        {
            System.out.println("Other party affiliations are beyond the scope of this program, sorry.");
        }
    }
}