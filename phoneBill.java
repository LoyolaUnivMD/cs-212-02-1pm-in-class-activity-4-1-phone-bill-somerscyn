import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	  DecimalFormat formatter = new DecimalFormat("###,###,###.##");

	    double cost = 0;
	    
	   System.out.println("What is your phone package? Valid options are green, blue, purple:");
	   String plan = input.nextLine().toLowerCase();
	   
	   while (plan != green || plan != blue || plan != purple){
	   System.out.println("Invalid input. What is your phone package? Valid options are green, blue, purple:");
	   String plan = input.nextLine().toLowerCase();
	   }
	   
	   System.out.println("How many gb did you use? Input a number");
	   int gb = input.nextInt();
	   
	   if (plan == "green"){
	   System.out.println("Do you have a coupon? Answer yes or no.");
	   String coupon = input.nextLine().toLowerCase();
	       
    	    while (coupon != "yes" || coupon != "no" ){
    	   System.out.println("Invalid input. Do you have a coupon? Answer yes or no.");
    	   String plan = input.nextLine().toLowerCase();
    	    }
	        
	        cost = (gb - 2)*15 + 49.99;
	        
	        if (coupon == "yes" && cost = 75){
	        cost -=20;
	        }
     
	   } // end of green
	   
	   
	   if (plan == "blue"){
	       cost = (gb - 4)*10 + 70;
	   }
	   
	   if (plan == "purple"){
	       cost = 99.95;}

	
	}
	
    System.out.println( "You used " + gb + "GB, and it cost you $" + formatter.format(cost));
	
	

}
