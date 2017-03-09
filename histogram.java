// OO Programming:  Lab3 -  Further Arrays , 
// Question 1 - Histogram.java        

import java.util.Scanner;

public class Histogram
{
   public static void main (String[] args)
   {
      int[] ranges = new int[10];  // each entry represents a range of values
      int box;

	  Scanner scan = new Scanner (System.in);
	
      System.out.println ("Enter some numbers between 1 and 100.");
      System.out.println ("Signal the end by entering a number outside " +
         "of that range.");
	  
      int entered = scan.nextInt();
      while (entered >= 1 && entered <= 100)
      {
         box = (entered - 1) / 10;
         ranges[box] ++;
         entered = scan.nextInt();
      }

      //  Print histogram.
      for (box = 0; box < 10; box++)
      {
         System.out.print ((10 * box + 1) + "-");
         System.out.print ((10 * box + 10) + "\t|");
         for (int count = 0; count < ranges[box]; count++)
            System.out.print ("*");
         System.out.println ();
      }
   }
}
