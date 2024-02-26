package LogicalProgramms;

public class ReverseAString 
{

	public static void main(String[] args) 
	{
String str="ABCD";
int length=str.length();
String reverse="";
for(int i=length-1;i>=0;i--)
{
	reverse=reverse+str.charAt(i);
	//here charAt[]is an index keyword which we use for char data to get a certain of a particulae index
	//string ch="abcd"---->ch.charAt[0]-->gives "a" because index starts with n-1;
	
}
System.out.println("the reversed String : "+reverse);
	 
/*	char []ch=str.toCharArray();
	for(int i=length-1;i>=0;i--)
	{
		reverse=reverse+ch[i];
		
	}
	System.out.println("the reversed string : "+reverse);*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
