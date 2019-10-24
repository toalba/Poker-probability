package poker;

import java.util.Scanner;

public class Pokermain {

	public static void main(String[] args) {
		long timeNeed=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie die Anzahl der Versuche ein, je höher desto genauer und desto länger braucht das Programm");
		int analytictimes= s.nextInt();
		
		Analytic Game = new Analytic(analytictimes);
		//Analyse
		timeNeed=System.currentTimeMillis();
		Game.analyse();
		//Ausgabe
		Game.output();
		timeNeed= System.currentTimeMillis()-timeNeed;
		System.out.printf("%d ms",timeNeed);
		System.out.println();
		s.close();
	}

}
