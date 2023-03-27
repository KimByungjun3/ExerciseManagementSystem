import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner  input = new Scanner(System.in);
		
		while (num != 6) {
		System.out.println("1. Plan Exercise Routine");
		System.out.println("2. Plan Tomorrow Exercise");
		System.out.println("3. Write Today Exercise");
		System.out.println("4. Write Weight");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6:");
		num = input.nextInt();
		if (num == 1) {
			System.out.print("Plan exercise Routine: ");
			String exerciseName = input.next();
		}
		else if (num == 2) {
			System.out.print("Plan Tomorrow Eercise: ");
			String tomorrowName = input.next();
		}
		else if (num == 3) {
			System.out.print("Write Today Exercise: ");
			String todayName = input.next();
		}
		else if (num == 4) {
			System.out.print("Write Weight: ");
			String weightName = input.next();
		}
		else {
				continue;
		}
		}
		} 
	}
