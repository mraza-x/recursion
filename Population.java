import java.util.*;

/**
  Mohammed Raza
  CSC 162 - Lab5 #5
*/

public class Population
{
	public static void main (String [] args)
	{

		double start;
		double increase;
		double days;

		Scanner console = new Scanner(System.in);

		System.out.print("Enter the starting number of organisms: ");
		start = console.nextDouble();

		System.out.print("Enter the daily increase: ");
		increase = console.nextDouble();

		if (increase <= 0)
		{
			System.out.print("Invalid daily increase");
		}

		System.out.print("Enter the number of days the organisms will multiply: ");
		days = console.nextDouble();

		if (days <= 0)
		{
			System.out.print("Invalid number of days");
		}

	}



	public static double displayPopulation(double start, double increase, double days)
	{


		System.out.print("Day            Organisms");
		System.out.print("_________________________");

		System.out.print(showPopulation(start, increase, days));

		return 0;

	}


	public static double showPopulation(double start, double increase, double days)
	{

		if (days <= 1)
		return 0;

		else

		return showPopulation(start,start + increase * days, days);

	}


}


