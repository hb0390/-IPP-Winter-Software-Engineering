import java.io.IOException;
import java.util.Scanner;

public class SimpleCalculator {
	public static double result;

	public static double add(int x, int y) {
		return x + y;
	}
<<<<<<< HEAD

	public static double sub(int x, int y) {

		return x - y;
	}

<<<<<<< HEAD
	public static double squareRootOfTen(int x) {
=======

	public static double sub(int x, int y) {

		return x - y;
	}

	public static double mul(int x, int y) {
      		
		return x*y;
   	}

	public static double divide(int x, int y) {
		return x / y;
	}

	public static double factorial(int x) {
		double result = 0;
		if (x == 1)
			result = 1;
		else
			result = x * factorial(x - 1);
		return result;
=======
	public static double mul (int x, int y) {
      		
		return x*y;
   	}

	public static double divide(int x, int y) {
		return x / y;
>>>>>>> db6f2c32639169b34f46de5f326b9bbaee22b583
	}

	public static double SquareRootOfTen(int x) {
>>>>>>> factorial
		double result = 1;
		for (int i = 0; i < x; i++)
			result = result * 10;
		return result;
	}
	
	public static double nSquare(int x, int y) {
		int result = x;
		for (int i = 1; i < y; i++) {
			result *= x;
		}
		return result;
	}


	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		boolean i = true;
		int x, y;

		while (i) {
			System.out.println('\n' + "[ Simple Calculator ]");
			System.out.println("1. x+y" + '\n' + "2. x-y" + '\n' + "3. x*y" + '\n' + "4. x/y" + '\n' + "5. x^y" + '\n'
					+ "6. x!" + '\n' + "7. x^2" + '\n' + "8. 10^x" + '\n' + "0. Quit" + '\n');
			System.out.printf("Select a menu:");
			int num = scanner.nextInt();
			switch (num) {

			case 1:
				System.out.println("Enter x: ");
				x = scanner.nextInt();
				System.out.println("Enter y: ");
				y = scanner.nextInt();
				while (x < 0) {
					System.out.println("Enter x: ");
					x = scanner.nextInt();
					System.out.println("Enter y: ");
					y = scanner.nextInt();
				}
				result = add(x, y);
				System.out.println("Result:  " + result);
				break;
			case 2:
				System.out.println("Enter x: ");
				x = scanner.nextInt();
				System.out.println("Enter y: ");
				y = scanner.nextInt();

				while ((x <= 0) || (y <= 0)) {
					System.out.println("Enter x: ");
					x = scanner.nextInt();
					System.out.println("Enter y: ");
					y = scanner.nextInt();
				}

				result = sub(x, y);
				System.out.println("Result:  " + result);

				break;
			case 3:

				 System.out.println("Enter x: ");
          			  x = scanner.nextInt();
           			 System.out.println("Enter y: ");
           			 y = scanner.nextInt();

           			 while ((x < 0) || (y < 0)) {
              			 System.out.println("Enter x: ");
             			 x = scanner.nextInt();
             			 System.out.println("Enter y: ");
              			 y = scanner.nextInt();
           			 }

         		   	result = mul(x,y);
         		   	System.out.println("Result:  " + result);

         		  	break;

			case 4:
				System.out.println("Enter x: ");
				x = scanner.nextInt();
				System.out.println("Enter y: ");
				y = scanner.nextInt();

				result = divide(x, y);
				System.out.println("Result : " + result);
				
				break;
			case 5:
				System.out.println("Enter x: ");
				x = scanner.nextInt();
				System.out.println("Enter y: ");
				y = scanner.nextInt();
<<<<<<< HEAD
<<<<<<< HEAD
				while ((x <= 0) || (y <= 0)) {
=======
				while ((x < 0) || (y < 0)) {
>>>>>>> factorial
=======
				while ((x < 0) || (y < 0)) {
>>>>>>> db6f2c32639169b34f46de5f326b9bbaee22b583
					System.out.println("Enter x: ");
					x = scanner.nextInt();
					System.out.println("Enter y: ");
					y = scanner.nextInt();
				}
				System.out.println("Result:  " + result*10);
				break;
			case 6:
				System.out.println("Enter x: ");
				x = scanner.nextInt();
				while (x < 0) {
					System.out.println("Enter x: ");
					x = scanner.nextInt();
				}

				result = factorial(x);
				System.out.println("Result: " + result);
				break;
			case 7:
				break;
			case 8:
				System.out.println("Enter x: ");
				x = scanner.nextInt();
				while (x < 0) {
					System.out.println("Enter x:");
					x = scanner.nextInt();
				}
				result = squareRootOfTen(x);
				System.out.println("Result:  " + result);
				break;
			case 0:
				i = false;
				break;
			}
		}
		scanner.close();
	}
}
