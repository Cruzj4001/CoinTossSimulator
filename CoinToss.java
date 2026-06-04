import java.util.Random;
import java.util.Scanner;

public class CoinToss 
{
    public state void main (String[] args)
    {

        Random random = new Random();
        int toss = random.nextInt(2);
        int heads = 0;
        int tails = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("How many times would you like to toss the coin?");

        int tossAmount = sc.nextInt();


        for (int i = 0; i < tossAmount; i++)
        {
            if (toss == 0)
            {
                System.out.println("Heads");   

            } 
            else
            {
                System.out.println("Tails");
                
            }
            
        }





    }

}