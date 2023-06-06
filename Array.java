import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		System.out.print("Enter the Limit :- ");
		int n1=s1.nextInt()+1;
		
		int nums[][]=new int[n1][];  //Jagged Array Declaration

		//Array Initialization
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=new int[11]; //Every Row Size 10

			for(int j=0;j<nums[i].length;j++)
			{
				
					nums[i][j]=i*j; //Calculate Table Logic Here
				
			}
		}

		int sum=11;
		//One more Printing logic you can skip also 
		if(n1<=10)
		{
			System.out.println("\n\t\t\t\t\t\t\t1 Table "+(n1-1)+"\t\n");
		}
		else
		{
			System.out.println("\n\t\t\t\t\t\t\t1 Table 10\t\n");
		}
		
		//Array Printing
		for(int i=1;i<nums.length;i++)
		{
			if(i<nums.length && i==sum)
			{
				sum=sum+10;
				System.out.println("\n\t\t\t\t\t\t\t"+(i)+" Table "+(sum-1)+"\t\n"); //One more Printing logic you can skip also
			}
				
			for(int j=1;j<nums[i].length;j++)
			{
				
				System.out.print(i+" * "+j+" = "+nums[i][j]+"\t"); //Table Printing Logic
				
			}
			System.out.println();
			
		}
		
	}

}
