import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so can kiem tra: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(n==sum)
		{
			System.out.println(n+" la so hoan hao");
		}
		else
		{
			System.out.println(n+" khong phai so hoan hao");
            sc.close();
		}

	}

}