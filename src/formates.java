
public class formates {

	public static void main(String[] args) 
	{
		/*
		 Basic concepts
	's' for general, The result is a string
	'c' for character, The result is a Unicode character
	'd' for integral, The result is formatted as a (decimal) integer
	'e' for floating point, The result is formatted as a decimal number in
	computerized scientific notation
	'f' for floating point, The result is formatted as a decimal number
	'%' for percent, The result is '%'
	'n' for line separator, The result is the platform-specific line separator
		  */
		
	
		
		
		double x=2.145213,y=2.99,z=0.0001,a=1.12141517001;
		String str2 = new String("Hello");
	
	String str = String.format(" x : %.2f%n y : %15.1f%n z : %e%n str2 : %15s" , x,y,z,str2);
	// in y, %15 provides spacing as well as str2
	System.out.println(str);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
