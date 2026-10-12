public class Circle	  	     	     	   	         	 	        	
{	  	     	     	   	         	 	        	
  private double radius;	  	     	     	   	         	 	        	
  private double x;	  	     	     	   	         	 	        	
  private double y;	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  // Various circle constructors...	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  public Circle()	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    this.x = 1.0;	  	     	     	   	         	 	        	
    this.y = 1.0;	  	     	     	   	         	 	        	
    this.radius = 1.0;	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  public Circle(double x, double y, double radius)	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    this.x = x;	  	     	     	   	         	 	        	
    this.y = y;	  	     	     	   	         	 	        	
    this.radius = radius;	  	     	     	   	         	 	        	
    if (this.radius < 0)	  	     	     	   	         	 	        	
    {	  	     	     	   	         	 	        	
      this.radius = 1.0;	  	     	     	   	         	 	        	
    }	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  public Circle(double x, double y)	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    this.x = x;	  	     	     	   	         	 	        	
    this.y = y;	  	     	     	   	         	 	        	
    this.radius = 1.0;	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  public Circle(double radius)	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    this.x = 1.0;	  	     	     	   	         	 	        	
    this.y = 1.0;	  	     	     	   	         	 	        	
    this.radius = radius;	  	     	     	   	         	 	        	
    if (this.radius < 0)	  	     	     	   	         	 	        	
    {	  	     	     	   	         	 	        	
      this.radius = 1.0;	  	     	     	   	         	 	        	
    }	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  // getters and setters	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  public double getRadius()	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    return this.radius;	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
  public void setRadius(double radius)	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    this.radius = radius;	  	     	     	   	         	 	        	
    if (this.radius < 0)	  	     	     	   	         	 	        	
    {	  	     	     	   	         	 	        	
      this.radius = 1.0;	  	     	     	   	         	 	        	
    }	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  public double getX()	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    return this.x;	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
  public void setX(double x)	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    this.x = x;	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  public double getY()	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    return this.y;	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
  public void setY(double y)	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    this.y = y;	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  // few methods	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  public double calculateCircumference()	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    return 2 * Math.PI * radius;	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
	  	     	     	   	         	 	        	
  public double calculateSurfaceArea()	  	     	     	   	         	 	        	
  {	  	     	     	   	         	 	        	
    return Math.PI * radius * radius;	  	     	     	   	         	 	        	
  }	  	     	     	   	         	 	        	
}