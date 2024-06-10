import java.util.Scanner; 
	
public class C15_Desion_and_Control_stm  // class name
{
	int a=10;
	int b=10;
    public void sequntial() // method Squntial
    {
     int i = 5;
     int j = 5;
     int sum1 = a + b;  
     int sum2 = i + j;
        System.out.println("sum1=" + sum1);  
        System.out.println("sum2="+ sum2);
    }
     public void conditions() 
     // if..else nested and if..else if..else ladder 
     {
    	 if(a!=b)
    	 {
    		 System.out.printf("both are not same");
    		 
    	 }
    	 else 
    	 {
    		 System.out.print("both are same");
    	 }
     }
     public void switch_stm() // Switch method
     {
    	 
    	 Scanner sc1 = new Scanner(System.in);
    	 System.out.print("Enter the value of inbetween 1 to 5: ");
    	 int x = sc1.nextInt();
    	
         switch (x) 
         {
         case 1:
             System.out.println("Excellent");
             break;
         case 2:
             System.out.println("Good");
             break;
         case 3:
             System.out.println("Average");
             break;
         case 4:
             System.out.println("Pass");
             break;
         case 5:
             System.out.println("Fail");
             break;
         default:
             System.out.println("Invalid input"); 
     }
         sc1.close();
     }
     public void while_stm()
     {
    	 int i=0;
    	 while(i<5)
    	 {
    		 System.out.println("iw: "+ i);
    		 i++;
    	 }
     }
	 
     public void do_while() 
     {
    	 int i=0;
    	 do
    	 {
    		 System.out.println("idw: " +i);
    		 i++;
    	 } while(i<5);
    			 
     }
     public void for_loop()  
     { 
    	 for(int i=0;i<=5;i++)
    	 {
    	 for(int j=5;j<=0;j--)
    	    {
    		 System.out.println("i: " + i + " " + j);
    	    }
    	 }
     }
     public void jump()
     {
    	 System.out.println("jump function start");
    	    int n[] = {10, 20, 30, 40, 50, 100};
    	    for (int i : n) 
    	    {
    	        if (i == 40) 
    	        {
    	            break;
    	        }
    	        System.out.println(i);
    	    }
    	}
     public void continue_stm()
     {
    	 System.out.println("continue function start");
    	    int n[] = {10, 20, 30, 40, 50, 100};
    	    for (int i : n)
    	    {
    	        if (i == 40) 
    	        {
    	            continue;
    	        }
    	        System.out.println(i);
    	   
    	    }
    	}

     public int return_stm() 
    		 {
    	      return a;
            }

     public static void main(String[] args) {
    	    C15_Desion_and_Control_stm dcs1 = new C15_Desion_and_Control_stm(); 
    	    // class  object < class_name >< class_object_name > = new < class_name >

    	    dcs1.sequntial();
    	    dcs1.conditions();
    	    dcs1.switch_stm();
    	    dcs1.while_stm();
    	    dcs1.do_while();
    	    dcs1.for_loop();
    	    dcs1.jump();
    	    dcs1.continue_stm();
    	    dcs1.return_stm();
    	}

}
