public class SimpleInterest
{
 public static void main(String args [])
 {
  double principal = 17000;
  double rate = 0.07;
  int years;
  years = 0;
  while(years < 5)
  {
   double interest;
   interest = principal *rate;
   principal = principal + interest;
   years = years + 1;
   System.out.println("The value of the investment after " +years);
   System.out.println("year is Rs. "+ principal);
  }
 }
} 