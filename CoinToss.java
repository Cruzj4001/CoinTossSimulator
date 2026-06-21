import java.util.Random;
import java.util.Scanner;

public class CoinToss 
{
    public static void main (String[] args)
    {

        System.out.println("Coin Toss Simulator");
        System.out.println(" ");
        System.out.println("Menu");
        System.out.println("1. Toss Coins");
        System.out.println("2. End Game");

        Scanner menuSc = new Scanner(System.in);

        int choice = menuSc.nextInt();

        if (choice == 1)
        {

            Random random = new Random();
        
            int heads = 0;
            int tails = 0;
    
        
            Scanner sc = new Scanner(System.in);

            System.out.println("\nHow many times would you like to toss the coin?");

            int tossAmount = sc.nextInt();

            System.out.println("\nHeads wins the bet.");

            System.out.println("\nWhich coin would you like to use?");

            Scanner coinChoice = new Scanner(System.in);

            System.out.println("1. Penny");
            System.out.println("2. Nickel");
            System.out.println("3. Dime");
            System.out.println("4. Quarter");

            double penny = 0.01;
            double nickel = 0.05;
            double dime = 0.10;
            double quarter = 0.25;
            double prize_pot = 0;


            for (int i = 0; i < tossAmount; i++)
            {
                int toss = random.nextInt(2);

                if (toss == 0)
                {
                   heads++;   

                } 
                else
                {
                    tails++;
                
                }

            }


            int coin = coinChoice.nextInt();

            if (coin == 1)
            {
                prize_pot = (penny * heads) - (penny * tails);
                System.out.println("\nCoin used: Penny");
            }
            else if (coin == 2)
            {
                prize_pot = (nickel * heads) - (nickel * tails);
                System.out.println("\nCoin used: Nickel");
            }
            else if (coin == 3)
            {
                prize_pot = (dime * heads) - (dime * tails);
                System.out.println("\nCoin used: Dime");
            }
            else if (coin == 4)
            {
                prize_pot = (quarter * heads) - (quarter * tails);
                System.out.println("\nCoin used: Quarter");
            }
            else
            {
                System.out.println("Input is not valid.");
            }



            System.out.println("Total tosses: " + tossAmount);

            System.out.println("Heads: " + heads);
        
            System.out.println("Tails: " + tails);

            System.out.println("\nHeads to Tails Ratio: " + heads + ":" + tails);

            System.out.printf("\nYou walk away with: $%.2f\n", prize_pot);

        }
        else if (choice == 2)
        {
          System.out.println("Game Over");
        }
        else
        {
            System.out.println("Input is not valid.");
        }

    }

        

}