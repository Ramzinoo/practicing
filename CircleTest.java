public class CircleTest	  	     	     	   	         	 	        	
{	  	     	     	   	         	 	        	
  public static void main(String args[])	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    Circle c2 = new Circle(1.0, 1.3, 1.4);	  	     	     	   	         	 	        	
    System.out.println(printCircle(c2));	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  public static String printCircle(Circle c)	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    return  "The circle is at x = " + c.getX() + " and y = " + c.getY() + " with a radius of " + c.getRadius();	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
}