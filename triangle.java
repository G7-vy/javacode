package exp5;

public class triangle {
	public String chk(int a,int b,int c) {
	if(a<=200 && b<=200 && c<=200 && a>=1 && b>=1 && c>=1) {
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
	
		
	}
}
