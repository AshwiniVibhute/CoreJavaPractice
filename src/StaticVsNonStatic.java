import java.util.concurrent.CancellationException;

public class StaticVsNonStatic {
	
	int rollNum=10;
	static String collegeName="KIT";
	
	static {
		System.out.println("This is staic block");
	}
	
	public static void callStatic()
	{
		collegeName="COEP";
		System.out.println("calling static method");
		System.out.println("static variable: "+collegeName);
		//calling non static method from static method.
	
		//callNonStatic();
	}
	
	public void callNonStatic()
	{
		collegeName="Walchand";
		System.out.println("calling non static method");
		System.out.println("static variable: "+collegeName);
		callStatic();
	}

	public static void main(String[] args)
	{
		//Call static method
		callStatic();
		StaticVsNonStatic st=new StaticVsNonStatic();
		st.callStatic();
		StaticVsNonStatic.callStatic();
		
		//Call static method
		st.callNonStatic();
		
		//
		System.out.println("rollnumber: "+st.rollNum);
		System.out.println("college name: "+collegeName);
	}
}
