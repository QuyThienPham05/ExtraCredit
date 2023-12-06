import java.util.Scanner;
public class userInput {
	public static double Calculate_Circle(double inputRadius) {
		double area = Math.PI*Math.pow(inputRadius, 2);
		return area;
	}
	
	public static int baseArea(int length, int height, int width) {
		int baseArea = length*width;
		return baseArea;
	}
	
	public static int volume(int length, int height, int width) {
		int volume = (length*width*height)/3;
		return volume;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Type 1 for Circle or 2 for Pyramid: ");
		int userChoice = scnr.nextInt();

		if ( userChoice == 1) {
			System.out.print("Enter radius: ");
			double inputRadius = scnr.nextDouble();
			System.out.print("Circle Area: ");
			System.out.println(Calculate_Circle(inputRadius));
		}
		else if (userChoice == 2) {
			System.out.println("Enter pyramid length: ");
			int inputLength = scnr.nextInt();
			System.out.println("Enter pyramid width: ");
			int inputWidth = scnr.nextInt();
			System.out.println("Enter pyramid height: ");
			int inputHeight = scnr.nextInt();
			
			System.out.print("Pyramid area: ");
			System.out.println(baseArea(inputLength, inputWidth, inputHeight));
			
			System.out.print("Pyramid volume: ");
			System.out.println(volume(inputLength, inputWidth, inputHeight));
		}
		else {
			System.out.println("Please try again");
		}
	}
}

