package LogicalProgramms;

public class FindingDuplicates
{
public static void main(String[] args) 
{
String str="automation";
int length=str.length();
char []chr=str.toCharArray();
for(int i=0;i<length;i++)
{
	for( int j=i+1;j<length;j++)
	{
		if(chr[i]==chr[j])
		{
			System.out.println("the duplicates are : "+chr[j]);
		}
	}

}

}
}
