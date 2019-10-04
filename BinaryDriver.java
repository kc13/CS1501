/***
* BinaryDriver.java
***/

public class BinaryDriver {
	
	public static void main(String[] args) {
		
		// single bit returned as boolean, since java does not have a 1-bit datatype
		boolean firstBit = BinaryStdIn.readBoolean();
		
		// need to convert to view as numeric value
		System.out.println("The first bit is " + (firstBit ? 1 : 0));
		
		// read next bit in file
		boolean secondBit = BinaryStdIn.readBoolean();
		
		// need to convert to view as numeric value
		System.out.println("The second bit is " + (secondBit ? 1 : 0));
		
		// read next char = 8 bits = 1 byte
		char nextEight = BinaryStdIn.readChar();
		
		// print out the result as an ascii char
		System.out.println("The next byte as ASCII is " + nextEight);

		// read in 6 bits and transform to int
		int nextSixToInt = BinaryStdIn.readInt(6);
		
		// print out the result as an ascii char
		System.out.println("The next 6 bits result in the int " + nextSixToInt);
		
		String everythingElse = BinaryStdIn.readString();
		
		// print out the result
		System.out.println("readString returned: "  + everythingElse);
		
	}
	
	
}
