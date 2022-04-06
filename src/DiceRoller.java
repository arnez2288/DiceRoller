import java.util.*;
public class DiceRoller {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean roll = true;
		Random rand = new Random();
		int i = 1;
		do {
		System.out.println("How many sides do you want your dice to have?");
		int sides = sc.nextInt();
		
		
		int rand_die1 = rand.nextInt(sides);
		int rand_die2 = rand.nextInt(sides);
		
		System.out.println("Roll " + i++);
		System.out.println(rand_die1);
		System.out.println(rand_die2);

		System.out.println("Want to Roll again?");
		sc.nextLine();
		String answ = sc.nextLine();
		if (answ.equalsIgnoreCase("n")) {
			roll = false;
		
		}
			
		}while(roll);
		sc.close();
	}

}
