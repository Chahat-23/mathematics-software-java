import java.util.Scanner;
public class myMathematics 
{
	int x,y,a,b;
	String ch;
	Scanner get= new Scanner(System.in);
	int random()
	{
		int m,n,l;
		System.out.println("Enter any 2 numbers");
		m=get.nextInt();
		n=get.nextInt();
		if(m>n)
		{
			l=m-n;
			int a[]=new int[l];
			for(int i=0;i<l;i++)
				{a[i]=n;
				n++;}
			return a[2];
		}
		else
		{
			l=n-m;
			int a[]=new int[l];
			for(int i=0;i<l;i++)
				{a[i]=n;
				n++;}
			return a[2];
		}
		
	}
	int prime_checker()
	{
		y=random();
		System.out.println("number is"+y);
		int i,flag=0;
		for(i=2;i<=y/2;i++)
		{
			if(y%i==0)
				{
          flag=1;
          break;
        }
		}
		System.out.println("Is it prime? Yes/No");
		ch=get.next();
		if(flag==0)
		{
			if(ch=="Yes")
				return 1;
			else
				return 0;
		}
		else
		{
			if(ch=="No")
				return 1;
			else
				return 0;
		}

	}
	int divisor_checker()
	{
		a=random();
		System.out.println("Tell a factor of "+a);
		b=get.nextInt();
        if(a%b==0)
        	return 1;
        else
        	return 0;
	}
}
	
