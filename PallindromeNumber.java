package LogicalProgramms;

public class PallindromeNumber
//pallindrome number is a number that is the same even after we reverse the number
{
public static void main(String[] args)
{
int Number=1224;
int temp=Number;
int Remainder=0;
int ReversedNumber=0;
while(Number>0)
{
	Remainder=Number%10;
	Number=Number/10;
ReversedNumber=(ReversedNumber*10)+Remainder;
}
System.out.println(ReversedNumber);

if(temp==ReversedNumber)
{
	System.out.println("it is a pallindrome");
}
else
{
	System.out.println("it is not a pallindrome");
}
}
}
