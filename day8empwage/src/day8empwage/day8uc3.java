package day8empwage;
import java.util.*;
public class day8uc3 {
		void show()
		{
			int hours=8, wage;
			String empname;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter emp name");
			empname=sc.nextLine();
			
			System.out.println("Enter emp wage per hour ");
			wage=sc.nextInt();
			
			int pay = wage * hours;
			System.out.println("Total emp wage is "+pay );
		}
		
		public static void main(String[] args) {
		day8uc3 obj = new day8uc3();
		obj.show();
	}

}
