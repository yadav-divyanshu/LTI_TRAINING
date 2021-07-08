import java.util.*;
public class Day1Assignment1{

     public static void main(String []args){
         float price;
         
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter units ");  
         float units= sc.nextInt();  
         
         if(units<100)
         price=(float)1.20*units;
         else if(units<=300){
             price=(float)(100*1.2)+((units-100)*2);
         }
         else{
             price=(float)(100*1.2)+(200*2)+((units-300)*3);
         }
        System.out.println("\nThe total cost is:"+price);
        
     }
}