import java.util.Scanner;
public class app4 {
    public static boolean check(int n)
	{
		if(n<2)
		{
			return false;
		}
		for(int i=2;i<= Math.sqrt(n);i++)
		{
			if(n%i ==0)
				return false;			
		}
		return true;
			
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("nhap n:  ");
	int n=sc.nextInt();
	System.out.println("cac so nguyen to nho hon "+n+" la: " +2);
	sc.close();
	for(int i=3;i<n;i+=2)
	{
		if(check(i))
		{
			System.out.print(i+" ");
		}
	}
	
}
}
