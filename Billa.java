import java.util.Scanner;


public class Billa {
 
	public static void main(String adas[]){
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(new Billa().check(a,b,c));
		
	}

	public int check(int a,int b,int c){
		int delta=b*b-4*a*c;
		if(delta==0)
			return 1;
		if(delta<0)
			return 0;
		return 2;
	}
}

