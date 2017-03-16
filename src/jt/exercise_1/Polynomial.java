import java.util.Scanner;
public class Polynomial{
	public static void main(String[] args){
		System.out.println("Wir berechnen das Polynom 7x² + 5x + 3");
		Scanner in = new Scanner(System.in);
		System.out.print("Bitte eine Zahl x eingeben: ");
		int x = in.nextInt();
		x = 7*x*x + 5*x +3;
		System.out.println("Ergebnis: " + x);
	} 
}
