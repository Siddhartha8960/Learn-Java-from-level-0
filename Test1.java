class function
{
 void first()
 {
  System.out.println("I am the first function");
 }
 void second()
 {
  System.out.println("I am the second function");
 }
}
public class Test1
{
 public static void main(String [] args)
 {
  function f = new function();
  f.first();
  f.second();
 }
} 