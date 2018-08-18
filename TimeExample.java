class TIME
{
	int H,M,S;
	TIME()
	{
		H=0;
		M=0;
		S=0;
	}
	TIME(int h, int m)
	{
		H=h;
		M=m;
		S=0;
	}
    TIME(int h, int m, int s)
	{
		H=h;
		M=m;
		S=s;
	}
	void add(TIME T)
	{
		H = H + T.H;
		M = M + T.M;
		S = S + T.S;
	}
	void add(TIME Z, TIME T)
	{
		H = Z.H + T.H;
		M = Z.M + T.M;
		S = Z.S + T.S;
	}
	void show()
	{
		System.out.println(H + ":" + M + ":" + S);
	}
}
public class TimeExample
{
 public static void main(String[] args)
 {
   TIME A = new TIME();
   TIME B = new TIME(2,30);
   TIME C = new TIME(4,50,35);
   
  System.out.println("The value of Time Object A:");
  A.show();
  
  System.out.println("The value of Time Object B:");
  B.show();
  
  System.out.println("The value of Time Object B:");
  C.show();
  
  System.out.println("The sum of Time Object B & C through Object A:");
  A.add(B,C);
  A.show();
  
  System.out.println("The sum of Time Object B & C through Object B:");
  B.add(C);
  B.show();
 }
}  