import java.util.Scanner;

public class Harshil {

	public static void
	guessingNumberGame()
	{
		
		Scanner sc = new Scanner(System.in);

		
		int number = 1 + (int)(100
							* Math.random());

		
		int H = 5;

		int i, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 100."
			+ "Guess the number"
			+ " within 5 trials.");

		
		for (i = 0; i < H; i++) {

			System.out.println(
				"Guess the number:");

			
			guess = sc.nextInt();

			
			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number.");
				break;
			}
			else if (number > guess
					&& i != H - 1) {
				System.out.println(
					"The number is "
					+ "greater than " + guess);
			}
			else if (number < guess
					&& i != H - 1) {
				System.out.println(
					"The number is"
					+ " less than " + guess);
			}
		}

		if (i == H) {
			System.out.println(
				"You have exhausted"
				+ " H trials.");

			System.out.println(
				"The number was " + number);
		}
	}

	public static void
	main(String arg[])
	{
		guessingNumberGame();

	}
}