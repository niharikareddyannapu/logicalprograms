package LogicalProgramms;

public class BubbleSort {

	public static void main(String[] args) 
	{
int arr[]={3,5,2,1,6};
int length =arr.length;
int temp=0;
System.out.println("length : "+length);
for(int i=0;i<length;i++)
{
	System.out.print(arr[i]+" ");
	for(int j=0;j<length-1;j++)
	{
if(arr[j+1]>arr[j])
{
	temp=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=temp;
}
	}
}
for(int i=0;i<length;i++)
{
	System.out.println();
System.out.println(arr[i]+",");
	}
	}
}
