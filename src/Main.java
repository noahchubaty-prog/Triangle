import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("There are three ways to solve a triangle but it depends on its properties ");
		System.out.println("Does your Triangle have three side lengths but missing an angle if so input yes or no");
		String yes1 =in.nextLine();
		if (yes1.equalsIgnoreCase("yes")) {
			threeSides();
		} else {
			System.out.println("You said no. Does your Triangle have two sides and an angle instead?");
			String yes2 =in.nextLine();
			if (yes2.equalsIgnoreCase("yes")) {
				twoSidesoneangle();
			} else {
			System.out.println("You once again said no. Does your triangle have only one side and two angles instead?");
			String yes3 =in.nextLine();
			if (yes3.equalsIgnoreCase("yes")) {
				oneSidetwoangles();
			} else { 
				System.out.println("Then why are you wasting my time!");
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			}
		}
	}
	
	public static void threeSides() {
		System.out.println("The Formula you want to use for this problem is Cosine law");	
		System.out.println("To use the Cosine law implement the formula: "
				+ "\n(B^2 + C^2 - A^2)"
				+ "\n---------------"
				+ "\n     2BC");
		System.out.println("Then use inverse cosine of your answer from above");
		System.out.println("You now have all the tools to solve your triangle!");
	}
public static void twoSidesoneangle() {
	System.out.println("There are two methods used to solve this triangle problem. Sine and Cosine Law");
	System.out.println("To use the Sine Law, you first need to find the other corresponding angle in the triangle.");
	System.out.println("To do this, you must line up your work like this: "
			+ "\nSin(B)= bsin(a)"
			+ "\n       --------"
			        +"\n          (A)");
	System.out.println("Then take the inverse of your answer to find your second corresponding angle.");
	System.out.println("Lastly, you want to use the sine law formula: a                    b"
			+ "\n                                           ---------      =     ---------"
			+ "\n                                            sin(a)               sin(b)                                                                                 ");
	System.out.println("Keep in mind that a and b are just variables so they can vary based on the question.");
	System.out.println("To use the cosine law, implement the formula: B^2+C^2-A^2"
			+ "\n                                              -----------"
			+ "\n                                                  2BC "
			+ "\nThen use the inverse cosine to get the angle");
	System.out.println("You now have all the tools to solve your triangle!");	
}
	public static void oneSidetwoangles() {
		System.out.println("For this triangle problem you can only use sine law");
		System.out.println("To use the sine law for this Specific Problem you want to acquire the third angle.");
		System.out.println("You can do this by simply subtracting both of your known angles from 180.");
		System.out.println("Whatever is left is your third angle.");
		System.out.println("Then implement the sine law formula: A         "
				+ "\n                                  -------    =      Bsin(B)"
				+ "\n                                   sin(A)  "
				+ "\nthen your triangle will have two known sides.");
		System.out.println("Then to find the last remaining side use this formula: Unknown Side(X) = Asin(Opposite of X)"
				+ "\n                                                                         ------------------"
				+ "\n                                                                               sin(B)");
		System.out.println("This is assuming that we know the sides A and B.");
		System.out.println("But if we know a pair of A and C or a pair of B and C then only the letters change not the process");
		System.out.println("You now have all the tools to solve your triangle!");
		
		
	}
}

