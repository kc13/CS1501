/***
* BinaryDriver.java
* Execution: java BinaryDriver < test.txt
***/

public class BinaryDriver {
	
	public static void main(String[] args) {
		
		// single bit returned as boolean, since java does not have a 1-bit datatype
		boolean firstBit = BinaryStdIn.readBoolean();
		
		// need to convert to view as numeric value
		System.out.println("The first bit is " + (firstBit ? 1 : 0));
		// note this will print a nice readable integer representation of the bit
		// see lines 54-55 below for the actual printing of a single bit to stdout
		
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
		
		// read in everything that remains in the file, as a string
		String everythingElse = BinaryStdIn.readString();
		
		// print out the result
		System.out.println("readString returned: "  + everythingElse);
		
		// use BinaryStdOut to write the first two chars of String *to a buffer*
		BinaryStdOut.write(everythingElse.substring(0,2));
		
		System.out.println("notice that nothing has been printed to the screen yet!");
		
		// flush the buffer to stdout
		BinaryStdOut.flush();
		
		System.out.println("\n see output of flush() above");
		
		// use BinaryStdOut to write a single "1" bit to stdout
		// (must be represented as boolean "true")
		BinaryStdOut.write(true);
		BinaryStdOut.flush();
		
		System.out.println("\n see output of flush() above");
		
		// close the input and output streams
		BinaryStdIn.close();
		BinaryStdOut.close();

	}
	
	
}
