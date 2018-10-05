import java.io.*;
import java.net.*;

class IP{
	public static void main(String[] args) {
		try{
			byte[] ipAddr1 = new byte[] { 52, 97, 28, 17 };
			InetAddress addr1 = InetAddress.getByAddress(ipAddr1);
			byte[] ipAddr = new byte[] { 127, 0, 0, 1 };
			InetAddress addr2 = InetAddress.getByAddress("localhost",ipAddr);
			InetAddress name = InetAddress.getByName("www.imdb.com");
			System.out.println("using getByName Address: "+name.getHostAddress()+" name:"+name.getHostName());
			System.out.println("using getByAddress Address: "+addr1.getHostAddress()+" name:"+addr2.getHostName());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}