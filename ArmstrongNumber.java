package LogicalProgramms;

public class ArmstrongNumber 
{

	public static void main(String[] args)
	{
int number=153;
int temp=number;
int result=0;
while(number>0)
{
	result=result+(number%10)*(number%10)*(number%10);
	number=number/10;
}
	if(result==temp)
	{
		System.out.println("the given number is a pallindrome : "+result);
	}
	else
	{
		System.out.println("the given number is not a pallindrome");
	}

	}

}
