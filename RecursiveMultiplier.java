import javax.swing.JOptionPane;

/**
  Mohammed Raza
  CSC 162 - Lab5 #1
*/

public class RecursiveMultiplier
{
	public static void main (String [] args)
	{
		String input1;
		String input2;
		double x;
		double y;


		input1 = JOptionPane.showInputDialog("Enter the first number: ");
		x = Integer.parseInt(input1);

		input2 = JOptionPane.showInputDialog("Enter the second number: ");
		y = Integer.parseInt(input2);

		JOptionPane.showMessageDialog(null, x + " * " + y + " = " + multiplier(x,y));

		System.exit(0);

	}

	public static double multiplier(double x, double y)
	{

		if (x == 0 || y == 0)

			return 0;
		else
			return y + multiplier(x - 1, y);

	}
}