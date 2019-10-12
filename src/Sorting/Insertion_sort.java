package Sorting;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {47,0,7,-2,-16};
for(int i=1;i<a.length ;i++)
{
	for(int j=0;j<i;j++)
	{
		if(a[i]<a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);	
}
	}
	}


