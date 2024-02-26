package LogicalProgramms;

public class FactorialOfNumber 
{
	public static void main(String[] args) 
	{
		int number=4;
		int factorial=1;
		for(int i=number;i>0;i--)
		{
			factorial=factorial*i;//1*4=4;4*3=12;12*2=24;24*1=24;
		}
		System.out.println("the factorials of the given number are : "+factorial);
	}

}
