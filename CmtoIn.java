public class CmtoIn
{
 public static void main(String []args)
 {
  double cm = Double.valueOf(args [0]).doubleValue();
  double inches = cm/2.54;
  System.out.println(inches + " inches");
 }
} 