import java.util.Scanner;
import java.math.*;

public class mainrun {
	
	public static void main(String[] args) {
		Scanner sic = new Scanner(System.in);
		intro();
		int ans = 42;//answer that is usually randomized
		//int ans = Math.random * 100;     -- usual code
		rungame(sic,ans);
		System.out.println("Do you want to play again?");
		String an = sic.nextLine();
		for (int y=0;y<an.length();y++) {
			if (an.charAt(y)=='Y'||an.charAt(y)=='y') {
				ans = 42; //ans=Math.random()*100;
				System.out.println("starting a new game");
				rungame(sic,ans);
				y=an.length();
			}
			else if (an.charAt(y)=='n'||an.charAt(y)=='N') {
				System.out.println("Thank you for playing come again!!");
			}
		}


	}//end of main
	
	static void intro() {
		System.out.println("So this is a guessing game, where you guess a number to see if its right");
		System.out.println("I will tell whether you are higher or lower");
		
	}
	static void rungame(Scanner s,int ans) {
		int x = 0;
		int guessc=0;
		System.out.println("Go! Print Your Number");
		while (x==0) {//runs until x is 0(x will be 0 when guess is correct
			int guess = s.nextInt();
			guessc++;
			x = check(guess,ans);//checks whether high or lower
			//System.out.println("x="+x+"guessc = "+guessc);
		}
		System.out.println("You got the answer with "+guessc+" guesses");
	}//end rungame
	
	static int check(int guess, int ans) {
		if (guess>ans) {
			System.out.println("Guess is too high! \n Try Again");
			return 0;
		} else if (guess<ans) {
			System.out.println("Guess is too low \n Try again");
			return 0;
		} else if (guess==ans) {
			System.out.println("Your guess is right!");
			return 1;
		}
		else {
			return 0;
		}

	}//end check
}


