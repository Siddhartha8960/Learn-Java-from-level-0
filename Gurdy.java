public class Gurdy
{
	public static void main(String [] args)
	{
	  int[] current = null;
	  int[] previous = {};
	  for(int r=1; r<17; r++)
	  {
	    current = new int[previous.length+1];
		current[0] = 1;
		current[previous.length] = 1;
		for (int c=1; c<previous.length; c++)
		{
		  current[c] = previous[c]+previous[c-1];
		}
       previous = current;
	  }
	  for (int r=0; r<current.length;r++)
	   {
	     System.out.print(" "+current[r]);
	   }
      System.out.println("");	   
	}
}	