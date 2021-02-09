
public class SomeTest {
	
	public static void main(String[] args) {
		String quadtag = "http://p.plipy.com/cgi/r?;n=203;c=1627760;s=23179;x=7936;f=201611151701230;u=j;z=TIMESTAMP;";
		String stripped = quadtag.substring(quadtag.indexOf("n=203"), quadtag.indexOf("TIMESTAMP") + "TIMESTAMP".length());
		System.out.println(stripped);
	}

}
