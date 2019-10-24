package test;
import poker.*;
import java.util.Scanner;

public class PokerTest {

    int[] hand = new int[5];
    public int pairs()
    {
        int[] amount = new int[13];
        for(int i=0;i<=hand.length-1;i++)
        {
           amount[hand[i]/13]++;       
        }
        int pairs = 0;
		for (int i = 0; i < 13; i++) {
			if (amount[i] == 2) {
				pairs++;
            }
        }
        return pairs;
    }
    public boolean checkpairs()
    {
        if(pairs()==1)
        {
            return true;
        }
        return false;
    }
 

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println(
                "Geben Sie die Anzahl der Versuche ein, je höher desto genauer und desto länger braucht das Programm");
        int analytictimes = s.nextInt();
        double pairCounter = 0;
        for(int i=0; i<analytictimes;i++)
        {
        Give gg =new Give();
        gg.gettoHand();
        if (gg.checkpairs())
        {
            pairCounter++;
        }
    }
        System.out.printf("Pairs:%f",(pairCounter*100)/ analytictimes);
        System.out.println("%");    
        s.close();   
    

}
}
