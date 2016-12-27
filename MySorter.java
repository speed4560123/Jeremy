package ntou.cs.sorter;

public class MySorter
{
	public void sort (double[] d)
	{
		for (int i = 0; i < d.length; i++)
		{
			for (int j = 0; j < d.length - i - 1; j++)
			{
				if (d[j] > d[j + 1])
				{
					swap(d, j, j+1);
				}
			}
		}
	}

	public void swap (double d[], int k, int s)
	{
		double temp = d[k];
		d[k] = d[s];
		d[s] = temp;
	}
	public static double[] ArrayReturn()
	{
		return new double[] {};
	}
	public static void main(String[] args)
	{
		double input[] = {  100, 10.10, 2.1, 2.0, 1.1, 1.0 };
        MySorter sorter = new MySorter();
        sorter.sort(input);
        for (double i: input) 
        {
        	 System.out.print(i + " ");
        }

	}
}

