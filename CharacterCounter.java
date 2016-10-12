import java.io.*;

/**
  Mohammed Raza
  CSC 162 - Lab5 #4
*/


public class CharacterCounter
{
	public static void main (String [] args)
	{


	char[] test = {'a','b','a','c','d','a','e','a','f','g','h','a','i','a'};
	int count = 0;

	System.out.println("The character 'a' appears " + charCount(test, count) + " times");

	}


	public static int charCount(char[] test, int count)
	{


	if (test[0] != 'a') // I cannot use this array recursively and still
						//	be able to pass it back to main
		return 0;


	else
		count = count + 1;

		return count;


	}
}