
public class MethodOverloading {

	
	void sum()
	{
		System.out.println("This is sum method with no parameter");
	}
	void sum(int a,int b)
	{
			int c= a+b;
			System.out.println("This is sum method with 2 parameter: "+ c);
		
	}
	
	void sum(int a, double e,int c)
	
	{
		double d=a+e+c;
		System.out.println("This is sum method with 3 parameter: "+d);
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading methodOverload=new MethodOverloading();
		methodOverload.sum();
		methodOverload.sum(2,3);
		methodOverload.sum(4,5.5,5);

	}

}
