package day8empwage;

public class day8uc1 {
   void a()
  {    
	   int emppresent=1; 
       double empcheck = Math.floor(Math.random() * 10) %2;
       
	  if(empcheck==1)
		{   
		  System.out.println("employee is present");
		}
	  
	  else 
		  System.out.println("employee is absent");
}
	public static void main(String[] args) {
		day8uc1 obj = new day8uc1();
		obj.a();

	}

}
