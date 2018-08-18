class First
{
	void first()
	{
		System.out.println("I am the First's first function");
	}	
    void second()
	{
		System.out.println("I am the First's second function");
	}
}
class Second
{
     void first()	
	 {
		 System.out.println("I am the Second's first function");
	 }
	 void second()
	 {
		 System.out.println("I am the Second's second function");
	 }
}
public class Test2
{
	public static void main(String [] args)
	{
		First F  = new First();
		Second S = new Second();
		F.first();
		S.first();
		F.second();
		S.second();
		System.out.println("I am the main function");
	}
}	