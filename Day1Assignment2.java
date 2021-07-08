//import java.util.*;
import java.util.Random;   

public class Day1Assignment2 {
    public static void main(String[] args) {
        int numZeros=0,numones=0, numtwos=0, numthrees=0,
        numfours=0, numsixes=0, randNum=5,total=0;
        int run[]=new int[30];
        float strikeRate;
        System.out.println("Random Runs: ");
        Random rand = new Random();
        for(int i=0;i<30;i++){
          while(randNum==5)
            randNum = rand.nextInt(7); 
          run[i]=randNum;
          total+=run[i];
          System.out.print(" "+run[i]+" ");
          if(randNum==0)
            numZeros++;
          if(randNum==1)
            numones++;
          if(randNum==2)
            numtwos++;
          if(randNum==3)
            numthrees++;
          if(randNum==4)
            numfours++;
          if(randNum==6)
            numsixes++;
          randNum = rand.nextInt(7); 
        }
        System.out.printf("\nTotal Runs are: %d",total);
        System.out.printf("\nNo. of 0s: %d", numZeros);
        System.out.printf("\nNo. of 1s: %d", numones);
        System.out.printf("\nNo. of 2s: %d", numtwos);
        System.out.printf("\nNo. of 3s: %d", numthrees);
        System.out.printf("\nNo. of 4s: %d", numfours);
        System.out.printf("\nNo. of 6s: %d", numsixes);
        strikeRate=(float)total/30*100;
        System.out.printf("\nStrike rate: %f", strikeRate);
        
    }
}