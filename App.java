import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	/*
	 * Window Master Program coded to use all the skills learned in Lesson 3 Software Guild Java Bootcamp
	 * This will incorporate primitives, scanner I/O, and arithmetic.
	 */
	Scanner sc = new Scanner(System.in);
	
	float height;
	float width; 
	
	float windowArea;
	float cost;
	float windowPerimeter;
		
	String stringHeight;
	String stringWidth;
	
	System.out.println("Please enter window height: ");
	stringHeight = sc.nextLine();
	System.out.println("Please enter window width: ");
	stringWidth = sc.nextLine();
	
	//Parse entered string into float by casting it as a Float(wrapper) and passing the scanned string as a parameter
	height = Float.parseFloat(stringHeight);
	width = Float.parseFloat(stringWidth);
	
	windowArea = height * width;
	windowPerimeter = windowArea * 2;
	cost = ((3.50f * windowArea)+(2.25f * windowPerimeter));
	
	System.out.println("Window height = "+ stringHeight);
	System.out.println("Window width = "+ stringWidth);
	System.out.println("Window area = "+ windowArea);
	System.out.println("Window perimeter = "+ windowPerimeter);
	System.out.println("Total Cost = $"+ cost);
	
	}
}
