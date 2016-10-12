/**
  Mohammed Raza
  CSC 162 - Lab5 #2
*/

public class StringReverser
{
	public static void main (String [] args)
	{
		String original = "Good Morning Java";


		System.out.println("Reversed string:");
		System.out.println("");
		System.out.println("Original: " + original);
		System.out.println("Reversed: " + strReverse(original));

	}

	public static String strReverse(String original)
	{

		if (original.length() <= 1)
		return " ";

		else
		return strReverse(original) + original.charAt(original.length() - 1);

		// Compiler will not allow me to apply the charAt method
		// within the strReverse recursive method.
		// Without doing this, it runs infinitely.


	}
}
