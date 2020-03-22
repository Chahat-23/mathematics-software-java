public class Main
{
	public static void main(String[] arg)
	{
		int sum,m,n,o;
		myMathematics m1=new myMathematics();
		System.out.println("Q1. Find Prime number or not?");
		m=m1.prime_checker();
		System.out.println("Q2. Find divisor .");
		n=m1.divisor_checker();
		System.out.println("Q1. Find Prime number or not?");
		o=m1.prime_checker();
		sum=m+n+o;
		System.out.println("Marks out of 3 are: "+sum);
	}
}
