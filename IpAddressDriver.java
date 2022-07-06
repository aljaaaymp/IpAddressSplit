/**
* Java Course 2, Module 2
* 
* IP Address
*
* @author Aljay Pascual
*/
package module2Graded;

public class IpAddressDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IpAddress ip = new IpAddress("216.27.6.136");
		
		System.out.println(ip.getDottedDecimal());
		System.out.println(ip.getOctet(4));
		System.out.println(ip.getOctet(1));
		System.out.println(ip.getOctet(3));
		System.out.println(ip.getOctet(2));

	   
	}

}
