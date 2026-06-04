import java.util.Random;
import java.util.Scanner;

public class CoinToss 
{
    public static void main (String[] args)
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

}