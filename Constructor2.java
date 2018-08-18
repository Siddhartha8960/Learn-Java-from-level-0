class Rock
{
	Rock(int i)
	{ 
	 System.out.println("Creating Rock Number" + i);
	}
}
public class Constructor2
{
 public static void main(String [] args)
 { 
   for(int i=0; i<10; i++)
   new Rock(i);
 }
} 