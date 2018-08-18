public class SeriesResistance 
{
 public static void main(String [] args)
 {
  double total = 0;
  double resistance;
  
  int i = 0;
  while(i < args.length)
  {
   resistance = Double.valueOf(args[i]).doubleValue();
   total = total + resistance;
   i=i+1;
  }
   System.out.println("The total resitance is " + total);
 }
} 