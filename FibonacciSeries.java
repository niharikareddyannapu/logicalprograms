package LogicalProgramms;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{//0,1,
	int firstnum=0;
	int secondnum=1;
	int thirdnum;
	int sequence=20;
	for(int i=0;i<sequence;i++)
	{
		System.out.print(firstnum+" ");//0,1,1
		thirdnum=firstnum+secondnum;//1//2
		firstnum=secondnum;//1
		secondnum=thirdnum;//1//2
	}
	}
	
}
