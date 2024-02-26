package LogicalProgramms;

public class PerfectNumber 
{

	public static void main(String[] args)
	{
int number=9;
int sum=0;
for(int i=1;i<number;i++)
{
	if(number%i==0)
	{
		sum=sum+i;
		System.out.println(sum);
	}
}
if(number==sum)
{
	System.out.println("it is a perfect number");
}
else
{
	System.out.println("it is not a perfect number");
}
	}

}
