package strategy.pattern.demo;
import java.util.Scanner;
import contextofchoice.Context; 
import choices.*; 
 
public class StrategyPatternEx {

	public static void main(String[] args) {
		
        System.out.println("***Strategy Pattern Demo***");
        Scanner in= new Scanner(System.in);
        //To take input from user
        IChoice ic = null;
        Context cxt = new Context();
        String input1,input2;
        try                
        {                        
        	for (int i = 1; i <= 2; i++)
        	{  System.out.println("Enter an integer:");
        		input1 = in.nextLine();
        		System.out.println("Enter another integer:");
        		input2 = in.nextLine();
        		System.out.println("Enter ur choice(1 or 2)"); 
        		System.out.println("Press 1 for Addition,  2 for Concatenation");
        		String c = in.nextLine();
        		
        		 if (c.equals("1")){                                       
        			 ic = new FirstChoice();  }
        		 else{ 
        			 ic = new SecondChoice();
        		 }
        		 cxt.SetChoice(ic);
        		 cxt.ShowChoice(input1,input2);

        	}
        }                
        finally                
        {                        
        	in.close();                
        	} 
        System.out.println("End of Strategy pattern");
        }
	}


