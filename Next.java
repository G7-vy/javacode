package exp6;
public class Next {
	   public static String next(int d,int m,int y,int cc)
	     {
	    	 if(d==cc)
	    	 {
	    		 d=1;
	    		 if(m==12)
	    		 {
	    		    y++;
	    		    m=1;
	    		 }
	    		 else
	    		 {
	    		   m++;
	    		 }
	    	 }
	    	 else
	    	 {	 d++;
	    	 }
	    	
	    	 
	    	 return (String.valueOf(d)+"/"+String.valueOf(m)+"/"+String.valueOf(y));
	     }
	     
	     public String nextday(int d,int m,int y)
	     {
	    	 if(d>=1 && d<=31 && m>=1 && m<=12 && y>=1812 && y<=2012)
	    	 {
	    		 switch(m)
	    		 {
	    		    case 1 :
	    		    case 3 :
	    		    case 5 :
	    		    case 7 :
	    		    case 8 :
	    		    case 10:
	    		    case 12: return(next(d,m,y,31));
	    		    case 4 :
	    		    case 6 :
	    		    case 9 :
	    		    case 11: 
	    		    	if(d>30)
	    		    	{
	    		    		return "Invalid Values";
	    		    		
	    		    	}
	    		    	return(next(d,m,y,30));
	    		    default : 
	    		    	if((y%4==0 && y%100!=0)||(y%400==0)) {
	    		    		return(next(d,m,y,29));
	    		    	}
	    		    	else return(next(d,m,y,28));
	    		 }
	    	 }
	    	 else return "Invalid Values";
	     }
	}

