public class Interest
{
 public static void main(String [] args)
 {
  double principal;
  double rate;
  double interest;
  
  principal = 17000;
  rate = 0.07;
  interest = principal * rate;
  principal  = principal + interest;
  
  System.out.println("The interest earned is Rs. " + interest);
  System.out.println("The value of the investment after one year is Rs. " + principal);
 }
} 