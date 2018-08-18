public class IntoCm
{
 public static void main(String [] args)
 {
  double inches = Double.valueOf(args[0]).doubleValue();
  double cm = inches * 2.54;
  System.out.println(cm + " centimeters");
 }
} 