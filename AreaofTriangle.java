import java.util.Scanner;

public class AreaofTriangle {
	double base=0, height=0;

//creating a non-static method
private void getDimension(){

//creating scanner class object
Scanner input = new Scanner(System.in);

//Getting base
System.out.println("Enter the base of the triangle");
base = input.nextDouble();

//Getting height
System.out.println("Enter the height of the triangle");
height = input.nextDouble();

//calculate the area of the triangle
double area = computeArea(base, height);

//display the result
displayTriangleArea(area);

}


//method to calculate the area of the triangle
public static double computeArea(double base, double height){

return 0.5 * base * height;
}

//method to display the calculated area
public static void displayTriangleArea(double area) {
System.out.println("The area of the triangle is " + area);

}

public static void main(String [] args){
//calling the method
new AreaofTriangle().getDimension();
}

}