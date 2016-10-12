import java.io.*;

/**
  Mohammed Raza
  CSC 162 - Lab5 #3
*/

public class MaxElementDemo
{
	public static void main (String [] args)
	{

	int[] numbers = {1,12,2,99,100,4,7,300};

	System.out.println("The largest value in the array is: " + search(numbers,0,numbers.length-1));

	}

	public static int search(int[]num, int lowerIndex, int upperIndex)
	{

	int largest;

	if(lowerIndex == upperIndex)

		return num[lowerIndex];

	else
	{
		largest = search(num, lowerIndex+1, upperIndex);

		if(num[lowerIndex] >= largest)

			return num[lowerIndex];
		else

			return largest;
	}


	}
}
