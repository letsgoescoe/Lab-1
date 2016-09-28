import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 */

/**
 * @author Student
 *
 */

public class Circle {
	
	//Declare instance variables

	public static double radius;
	public double area;
	public double circumference;

//Declare your constructor
public Circle (double rad) {
	
	radius =  rad;
	
}
	
//Acquire method for circumference
  public double getCircumference( ) {
	double circ = 2* Math.PI*(radius);
	 return circ;
	 }
  
  //Acquired method formatted Circumference
 public String getFormattedCircumference(){
	 String myCirc = formatNumber(getCircumference());
	 return myCirc;
 }
 
 //Acquire method for area
 public double getArea(){
 double area = Math.PI*(radius*radius);
 return area;
 }
 
 public String getformattedArea(){
	 String myArea= formatNumber(getArea());
	 return myArea;
 }
 
 //Acquire method for formatted number
  private String formatNumber(double x){
	  String formatNumber = String.format("%,.2f",x);
	  return formatNumber;
  }
	
//public static int getObjectCount(){
	
	//int
	//return objectCounter;
//}


	
	
	

	
	


	
	

}




