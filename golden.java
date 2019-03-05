import java.util.Scanner;
public class golden{
int w,h,k;
	public static void main(String[] args){
	int sum=0;
	Scanner sc=new Scanner(System.in);
	int w=sc.nextInt();
	int h=sc.nextInt();
	int k=sc.nextInt();
	while(k>0)
	{
		sum=sum+((w*2)+(h*2)-4);
		w=w-4;
		h=h-4;
		k--;
	}

	System.out.println(sum);
	}
}
		
