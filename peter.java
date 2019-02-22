import java.util.Scanner;
public class peter{
	public static void main(String[] args){
					Scanner sc=new Scanner(System.in);
					int r,g,b,red,green,blue;
					int n=sc.nextInt();
					int k=sc.nextInt();
					r=n*2;
					g=n*5;
					b=n*8;
					if(r%k==0){
						red=r/k;
					}
					else{
						red=r/k+1;
					}
					if(g%k==0){
						green=g/k;
					}
					else{
						green=g/k+1;
					}
					if(b%k==0){
						blue=b/k;
					}
					else{
						blue=b/k+1;
					}
			System.out.println(red+blue+green);
		}
}



					
