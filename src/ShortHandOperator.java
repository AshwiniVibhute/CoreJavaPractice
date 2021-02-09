import java.lang.invoke.SwitchPoint;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;

public class ShortHandOperator {

	public static void main(String[] args) {

		byte b=8;
//		I won't work because it will always try to convert the second variable data type to the fist variable 
//		i.e here it will try to convert byte to double
//		b=b* 3.5;
		b*=3.6;
		
		System.out.println("value of b is:" + b);	
		
//		Post and pre increment
		int  i=5;
		
		int temp=i;
		i++;
		i=temp;
//		i=i++;
//		int j=++i;
		
//		System.out.println("value of j is:" + j);
		System.out.println("value of i is:" + i);
		
	
	
//Bitwise operator
	
	int a=20;
	int d=10;
	
	int c=a | d;
	System.out.println("value of c is:" + c);	
	
	
	
	//if else statement
	
	int e,f,g;
	e=10;
	f=5;
	g=20;
	
	if (e>f && e>g) {
		System.out.println("greater value is e:" + e);
	} else if (f>g) {
		System.out.println("greater value is f:" +f);
	} else {
		System.out.println("greater value is g:"+g);
	}

//	Finding odd and even number using if else
	
	int h=6;
	if (h%2 == 0) {
		System.out.println("Number is even");
	} else {
		System.out.println("Number is odd");

	}
	int k=5;
	int l=k == 5 ? 5 :7;
	System.out.println("valus of l:"+l);
		
	
	
	String string="Hello";
	switch(string)
	{
		case "Hi":
			System.out.println("say hi");
			break;
		
		case "Hello":
			System.out.println("say hello");
			break;
		
		case "Hey":
			System.out.println("say hey");
			break;
	}
//	while, do while and for loop

	int m=1;
/*	while(m<=10) {
		System.out.println(m);
		m++;
	}
	
	
	do {
		System.out.println(m);
		m++;
	}while(m<=10);
	}
*/
	
	for (int i1 = 0; i1 <= 10; i1++) {
		System.out.println(i1);
	}
	
//	Pattern 1
	System.out.println("pattern 1");
	for(int r=1; r<=4; r++) {
		for(int j=1; j<=4; j++) {
			
			System.out.print("* ");
			
		}
		System.out.println("");
	}
	
	
//	Pattern 2
	System.out.println("pattern 2");
	for(int r=1; r<=4; r++) {
		for(int j=1; j<=r; j++) {
			
			System.out.print("* ");
			
		}
		System.out.println("");
	}
	
//	pattern 3
	System.out.println("pattern 3");
	for(int r=1; r<=4; r++) {
		for(int j=1; j<=4; j++) {
			
			if (r==1 || r==4 || j==1 || j==4) {
				System.out.print("*");
			}else {
			System.out.print(" ");
			}
		}
		System.out.println("");
	}
	
//pattern 4
	System.out.println("pattern 4");
	for(int r=1; r<=4; r++) {
		for(int j=r; j<=4; j++) {
				System.out.print(j);
				
			}
		System.out.print("\n");
		}
		System.out.println("");
	
	
	
//	Pattern 5
	System.out.println("pattern 5");
	for(int r=1; r<=4; r++) {
		for(int j=r; j<=4; j++) {
				System.out.print(r);
			}
		System.out.print("\n");
		}
		System.out.println("");
	
//	Fibonacci series
	
	int n1=1,n2=1,n3;
	n3=0;
	System.out.print("1 1 ");
	while(n3<15)
	{
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
	}
	System.out.println("\n");
//	How to check number is palindrome or not
	System.out.println("verify number is palindrome or not");
	int num=121, r, s=0;
	int finalNum=num;
	System.out.println("Given number: "+num);
	while (num>0)
	{
		r=num%10;
		num=num/10;
		s=s*10+r;
	}
	if (finalNum==s) {
		System.out.println("Number is palindrome");
	}else {
		System.out.println("Number is not palindrome");
	}
	
//	reverse string
	
	System.out.println("revers the string");
	String input="Ashwini";
	String revers="";
	char ch[]=input.toCharArray();
	System.out.println(ch.length);
	for(int r1=ch.length-1; r1>=0; r1--)
	{
		System.out.print(ch[r1]);
	}
	System.out.println(" \n ");
// Alternate upper and lower cases string
	
	System.out.println("Alternate upper and lower cases string");
	String inputString="Ashwini";

	inputString=inputString.toLowerCase();
	for(int t=0; t<inputString.length();t++)
	{
		if (t%2 == 0) {
			System.out.print(Character.toUpperCase(inputString.charAt(t)));
		}else {
			System.out.print(Character.toLowerCase(inputString.charAt(t)));
		}
	}
	System.out.println(" \n ");
	
//Check number is prime or not
	System.out.println("Check if number is positive or not");
	int number=30;
	System.out.println("Given number: "+ number);
	boolean isPrime=true;
	for(int i1=2; i1<number; i1++)
	{
		if(number%i1 == 0) {
			isPrime=false;
			break;
		}
	}
	if(isPrime) {
		System.out.println("Number is prime");
	}else {
		System.out.println("Number is not prime");
	}
	
	System.out.println(" \n ");
	
//	swapping of two numbers
	
	int num1=4;
	int num2=6;
	num1=num1+num2- (num2=num1);
	
	System.out.println("swapped numbers: "+ num1+ num2);
	
}
}

	

