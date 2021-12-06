package exp2;
import java.util.Scanner;
public class triangle {
	public static void main(String[] args) {
		int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 3 sides:");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			triangle t=new triangle();
			System.out.println(t.chk(a, b, c));
	}
	public  String chk(int a,int b,int c) {
	if(a<=200 && b<=200 && c<=200 && a>=0 && b>=0 && c>=0) {
			if(a+b>c && b+c>a && c+a>b) {
					if(a==b && b==c) 
						return("equilateral");
					else if(a!=b && b!=c && c!=a)
						return("scalene");
					else
						return("isosceles");	
			}
			else
				return("not a triangle");
		}
	else 
		return("invalid");
	

}}
