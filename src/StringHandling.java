
public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="India";
		String str1="India";
		String str3=new String();
		str3="India";
		String str4=new String();
		str4="India";
		
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		str.concat(" is best country");
		
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.isEmpty());

		String longstr="Ashu, jayu, Devaansh";
		
		System.out.println(longstr.contains("Ashu"));
		
		System.out.println(longstr.substring(5));
		System.out.println(longstr.substring(5, 10));
		System.out.println(longstr.charAt(2));
		System.err.println(longstr.replace("u", "e"));

	}

}
