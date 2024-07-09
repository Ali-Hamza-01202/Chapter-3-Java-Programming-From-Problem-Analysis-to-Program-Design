import javax.sound.midi.Sequence;

public class Basics {

	public static void main(String[] args)
	{
		int x = 9,result;
		result = (int)(Math.pow(x,3)); // x is base and 3 is exponent where function is math
		int result2 = (int)(Math.sqrt(x)); // square root of x where function is math
		String str = new String("Programming with Java ");
		
		char character = str.charAt(4);
		int index = str.indexOf('g');
		int indexbyPosition = str.indexOf('a',6);// after position 6, char a is present to which index
		int indexStr = str.indexOf("with"); // gives the index of with
		String str2 = new String("Move to excellence, not for marks");
		String concatination = str.concat(str2);//Both concatination and concatination2 can do the same job
		//String concatination2 = str+" "+str2;
		int comparison = str.compareTo(str2);
		// we use int comparison becuase it returns numbers like positive, negatice or zero
		//Returns a negative value if this string is less than str
		//Returns 0 if this string is same as str
		//Returns a positive value if this string is greater than str
		boolean equals = str.equals(str2);
		// returns true if both strings are equal else false
		String replace = str.replace('a','h'); // replaces 'a' entities with 'h' in String str
		String subString = str.substring(12); // after 12, with Java is printed
		String subString2 = str.substring(12,17); // starts from 12 and ends at 17 only prints "with"
		String upperCase = str.toUpperCase(); // it converts str to upperCase
		String lowerCase = upperCase.toLowerCase(); // it converts above upperCase string to lowerCase
		boolean start = str.startsWith("Programming"); // returns true as str starts with the word Programming
		boolean ends = str.endsWith("With"); // returns false, as ends at Java
		boolean regionMatches = str.regionMatches(11, str2, 11, 32);// return false because all conditions are opposite to each other
		String str3 = new String("with");
		boolean regionMatches2 = str.regionMatches(12, str3, 0, 3);
		/* 12 is start point of str
		 str3 is string
		 0 is start point of str3
		 3 is length of str3 so results true*/
		
		System.out.println(x+" raise to the power of 3 = "+result);
		System.out.println("Square root of "+x +" is "+result2);
		System.out.println("Stirng 1 :"+str);
		System.out.println("String 2 : "+str2);
		System.out.println("String 3 "+str3);
		System.out.println("Length of string 1 is :"+str.length());
		System.out.println("In String 1, Char at 4 is "+character);
		System.out.println("In String 1, Index Of g is "+index);
		System.out.println("In String 1, index by position is "+indexbyPosition);
		System.out.println("In String 1, Char at 4 is "+character);
		System.out.println("In String 1, Index of 'with' is "+indexStr);
		System.out.println("In String 1, str concatinate with str2 is: \n"+concatination);
		System.out.println("In String 1, str compare to str2 : "+comparison);
		System.out.println("In String 1, Is str equals str2? "+equals);
		System.out.println("In String 1, replace a with h is: \n"+replace);
		System.out.println("In String 1, subString after index12 is : "+subString);
		System.out.println("In String 1, subString after index12  and till position 17 is : "+subString);
		System.out.println("UpperCase of String 1 is  : "+upperCase);
		System.out.println("LowerCase of (upperCase of String 1)  : "+lowerCase);
		System.out.println("Is String 1 starts with word 'Programming' : "+start);
		System.out.println("is String 1 ends at word 'Java' : "+ends);
		System.out.println("Region Matches is : "+regionMatches);
		System.out.println("RegionMatches2 is :"+regionMatches2);
		
		
		
		
		
	}

}
