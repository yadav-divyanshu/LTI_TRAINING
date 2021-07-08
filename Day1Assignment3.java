//import java.util.*;
import java.util.Random;   

public class Day1Assignment3 {
    public static void main(String[] args) {
        int numZeros=0,numones=0, numtwos=0, numthrees=0,
        numfours=0, numsixes=0, randNum=5;
        int totalRuns=0;
        float avgScore=0;
        int run[]=new int[30];
        //System.out.println("Random Runs: ");
        Random rand = new Random();
        for(int m=1;m<=5;m++) {
        	
        for(int i=0;i<30;i++){
          while(randNum==5)
            randNum = rand.nextInt(7); 
          run[i]=randNum;
          //total+=run[i];
          totalRuns+=run[i];
          //System.out.print(" "+run[i]+" ");
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
   
        }
        avgScore=(float)totalRuns/5;
        System.out.printf("\nAvgScore: %f", avgScore);
        System.out.printf("\nTotal Runs are: %d",totalRuns);
        System.out.printf("\nNo. of 0s: %d", numZeros);
        System.out.printf("\nNo. of 1s: %d", numones);
        System.out.printf("\nNo. of 2s: %d", numtwos);
        System.out.printf("\nNo. of 3s: %d", numthrees);
        System.out.printf("\nNo. of 4s: %d", numfours);
        System.out.printf("\nNo. of 6s: %d", numsixes);
        float avgStrikeRate=(float)totalRuns/150*100;
        System.out.printf("\nAvgStrike rate: %f", avgStrikeRate);
        
    }
}