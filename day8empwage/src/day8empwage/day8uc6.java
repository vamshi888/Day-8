package day8empwage;
import java.util.*;
public class day8uc6 {
		void a()
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("enter empdays " );
		    int	empdays = sc.nextInt();
		  
		    System.out.println("enter emphours " );
		    int	emphours = sc.nextInt();
			int empwageperhour=20;
		    int pay = empwageperhour * empdays * emphours;
		
		   if (empdays<=20 && emphours<=100)
		{ 
			System.out.println("Total emp wage is "+pay); 
		}
		
		  else 
			System.out.println("emp overworked ");
		
		}
	      public static void main(String[] args) {
		    day8uc6 obj = new day8uc6();
		    obj.a();
	}

}
