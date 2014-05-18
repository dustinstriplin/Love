import java.util.Scanner;


public class Love {
	public static final boolean LOVE = true;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hey Jamie, Press a key");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		int i = 1;
		while(LOVE) {
			System.out.println("I love you " + i + " times");
			i++;
		}
	}

}
