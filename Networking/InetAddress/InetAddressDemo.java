// program to find IP address of www.ampmboy.com

import java.net.*;
 
public class InetAddressDemo 
{
	public static void main(String[] args) throws UnknownHostException 
	{
		InetAddress ip = InetAddress.getByName("www.ampmboy.com");
		System.out.println("HostName="+ip.getHostName());
		System.out.println("IP address="+ip.getHostAddress());
	}
}
