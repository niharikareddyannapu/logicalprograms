package LogicalProgramms;

public class FindingDuplicatesCount 
{
public static void main(String[] args) 
{
	String str="rbg technologies";
	int count=0;
	char[]ch=str.toCharArray();
	for(int i=0;i<str.length();i++)//n//i//v//v//i//n
	{
		for(int j=i+1;j<str.length();j++)//i,v,v,i,n
		{
			if(ch[i]==ch[j])
			{
				count++;//0+1
				System.out.println("the duplicates are : "+ch[i]);
			}
		}
	}
	System.out.println("the no.of counts: "+count);
}

}
