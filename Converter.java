public class Converter
{
 public static void main(String ...s)
 {
   //Printing out a welcome message
   
   System.out.println("Welcome to my Temperature Converter");
   System.out.println("\n Program to convert Fahrenheit to celcius. \n");
   
   // Defining the temperature value in Fahrenheit
   double temp = 212.0;
   
   //Applying conversation formula and storing answer in another variable 
   double convertedTemp = 5.0 / 9.0 * (temp -32.0);
   
   //Printing out the complete answer
   
   System.out.println(temp + "Fahrenheit = " + convertedTemp + "Celcius.");
  }
}    