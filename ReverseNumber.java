package LogicalProgramms;

public class ReverseNumber {

	public static void main(String[] args) 
	{
int number=12345;
int remainder=0;
int reversedNumber=0;
while(number>0)
{
	remainder=number%10;
	number=number/10;
	reversedNumber=(reversedNumber*10)+remainder;
}
System.out.println(reversedNumber);
	}

}
