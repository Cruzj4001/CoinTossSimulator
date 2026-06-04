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

            System.out.println("How many times would you like to toss the coin?");

            int tossAmount = sc.nextInt();


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


            System.out.println("Total tosses: " + tossAmount);

            System.out.println("Heads: " + heads);
        
            System.out.println("Tails: " + tails);


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