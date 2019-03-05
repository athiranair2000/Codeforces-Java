import java.util.Scanner;
public class coins{
	public static void main(String[] args){
		int res=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		res=t/n;
		if(t%n>0){
			res++;
		}
		System.out.println(res);
		}
	
}
		
