import java.io.IOException;
import java.util.Scanner;

public class SimpleCalculator {
	public static double result;

	public static double SquareRootOfTen(int x) {
		double result = 1;
		for (int i = 0; i < x; i++)
			result = result * 10;
		return result;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		boolean i = true;
		int x, y;

		while (i) {
			System.out.println('\n' + "[ Simple Calculator ]");
			System.out.println("1. x+y" + '\n' + "2. x-y" + '\n' + "3. x*y"
					+ '\n' + "4. x/y" + '\n' + "5. x^y" + '\n' + "6. x!" + '\n'
					+ "7. x^2" + '\n' + "8. 10^x" + '\n' + "0. Quit" + '\n');
			System.out.printf("Select a menu:");
			int num = scanner.nextInt();
			switch (num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("Enter x y:");
				x = scanner.nextInt();
				y = scanner.nextInt();
				while((x<0) || (y<0)){
					System.out.println("Enter x y:");
					x = scanner.nextInt();
					y = scanner.nextInt();
				}
				result =nSqure(x,y);	
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.out.println("Enter x: ");
				x = scanner.nextInt();
				while(x<0){
					System.out.println("Enter x:");
					x = scanner.nextInt();
				}
				result = SquareRootOfTen(x);
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
