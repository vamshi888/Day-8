package day8lineprbm;

import java.util.Scanner;
public class day8uc3 {

	     public void a()
   {  //Entering values of x1,y1 & x2,y2 
	     double x1,y1,x2,y2;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter x1 & y1");
         x1=sc.nextInt();
         y1=sc.nextInt();
         System.out.println("enter x2 & y2");
         x2=sc.nextInt();
         y2=sc.nextInt();
         // calculating length of line 1
         double  length1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
         System.out.println("length of line is "+length1);
	}	
	     public void b()
    {  //Entering values of x3,y3 & x4,y4 
	   double x3,y3,x4,y4;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x3 & y3");
        x3=sc.nextInt();
        y3=sc.nextInt();
        System.out.println("enter x4 & y4");
        x4=sc.nextInt();
        y4=sc.nextInt();
       // calculating length of line 2
        double  length2 = Math.sqrt(Math.pow(x4-x3, 2)+Math.pow(y4-y3, 2));
        System.out.println("length of line is "+length2);
	}
	
	 if ((length1.compareTo(length2))>0)
	 {
		 System.out.println("line 1 is greater");
	 }
	 
	 else if ((length1.compareTo(length2))<0)
	 {
		 System.out.println("line 2 is greater");
	 } 
	 else
		System.out.println("both are equal");
	
	  	public static void main(String[] args) {
	
	       day8uc3 obj = new day8uc3();
	        obj.a();
        	obj.b();	
	}	
  }
 }