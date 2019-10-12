package Sorting;

public class Insertion_Sort_Method {

	public static int[] IS(int b[] )
	{
		
		for(int i=1;i<b.length ;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
			
		}
		return b;
	}
	
	public static void main(String[] args) {
	int a[]= {47,0,7,-2,-16};
int c[]=IS(a);
for(int i=0;i<c.length;i++)
{
System.out.println(c[i]);	
}

	}

}
