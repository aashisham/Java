import java.net.*;


public class URLClassDemo
{
	public static void main(String[] args) throws Exception {
		URL abc = new URL("http://abc.com:8080/test.php");
		System.out.println(abc.getProtocol());
		System.out.println(abc.getHost());
		System.out.println(abc.getPort());
		System.out.println(abc.getFile());

	}
}
