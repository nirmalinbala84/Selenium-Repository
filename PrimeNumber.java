package firstproject;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=17;
		boolean flag=false;
		if(input==0||input==1)
		{
			System.out.println("The Number is prime");
		}
		
	
	else
	{
	for(int i=2;i<input;i++)
	{
		if(input%2==0)
		{
		System.out.println("The Number is not prime");
		flag=true;
		break;
		}
	}
		if(flag==false)
		{
			System.out.println("The Number is prime");
			
		}

}
	}
}


	

