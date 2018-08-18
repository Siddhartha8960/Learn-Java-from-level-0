class Shape
{
	 double area(float r)
	 {
		 return 3.14 * r * r;
	 }
     float area(float l, float b)
	 {
		 return (l*b)/2;
	 }
		int area(int a)
		{
			return a*a;
		}
}
public class Overloading
{
	public static void main(String[] args)
	{
		Shape A = new Shape();
		double circle = A.area(7.2f);
		System.out.println("Area of circle is :"+ circle);
		
		float rect = A.area(2.0f, 8.4f);
		System.out.println("Area of the rectangle is:"+ rect);
		
		int square = A.area(2);
		System.out.println("Area of square is:"+ square);
	}
}	