package LogicalProgramms;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int number=8;
		int count=0;
		for( int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
				//here prime number is a number that has factorials of 1 and itself,since a prime number has 2 factorials which we took as count here
			}
		}
		if(count==2)
		{
			System.out.println("it is a prime");
		}
		else
		{
			System.out.println("it is not prime");
		}
	}


}
