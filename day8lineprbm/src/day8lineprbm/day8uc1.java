package day8lineprbm;
import java.util.*;
public class day8uc1 {
	   void a()
	   
	   {   int x1,y1,x2,y2;
         Scanner sc = new Scanner(System.in);
        System.out.println("enter x1 & y1");
        x1=sc.nextInt();
        y1=sc.nextInt();
        System.out.println("enter x2 & y2");
        x2=sc.nextInt();
        y2=sc.nextInt();
       double  distance = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
       System.out.println("length of line is "+distance);
}
	public static void main(String[] args) {
		
		day8uc1 obj = new day8uc1();
        obj.a();
	}

}
