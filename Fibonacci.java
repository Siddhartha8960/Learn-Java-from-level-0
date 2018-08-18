public class Fibonacci 
{
 public static void main(String args[])
 {
  int i;
  int fibold;
  int fibnew;
  int temp;
  
  i=0;
  fibold = 1;
  System.out.println(fibold);
  fibnew = 1;
  System.out.println(fibnew);
  
  while(i<19)
  {
   temp = fibold + fibnew;
   fibold = fibnew;
   fibnew = temp;
   System.out.println(fibnew);
   i=i+1;
  }
 }
} 