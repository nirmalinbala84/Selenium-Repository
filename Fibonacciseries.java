package week1.day1;

public class Fibonacciseries {
	//0,1,1,2,3,5,8,13,21,34

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=10;i++)
		{
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}

	}

}
//Learned the logic of Fibonacci series
//iteration
//package and class creation