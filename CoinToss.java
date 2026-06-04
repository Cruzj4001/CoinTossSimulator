import java.util.Random;
import java.util.Scanner;

public class CoinToss 
{
    public state void main (String[] args)
    {

        Random random = new Random();
        int toss = random.nextInt(2);

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