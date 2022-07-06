/**
* Java Course 2, Module 2
* 
* IP Address
*
* @author Aljay Pascual
*/
package module2Graded;

public class IpAddress {

	
	String dottedDecimal;
	
	
	public IpAddress(String dottedDecimal) 
	{
		this.dottedDecimal = dottedDecimal; // assigning global variable to this variable name
	}

	public String getDottedDecimal ()
	
	{
		return this.dottedDecimal;
	}
	
	public int getOctet (int ip )
	
	{
		ip = ip -1; // lessen by 1 to adjust the Index from 0
		int ipSplit = 0;
		String[] ipList = getDottedDecimal ().split("\\."); // splitting the IP address by " . " 
		ipSplit = Integer.parseInt(ipList[ip]); // converting String ipList to Integer ipSplit
		return ipSplit;
	}
	
	
}
