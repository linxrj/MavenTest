package de.hfu;

import java.util.Scanner;

/**
* App zum Einlesen eines Strings und der Ausgabe
* desselben Strings in Großschreibung.
*
* @author Jonas
* @version 1.0
*/
public class App 
{
	/**
	 * main-Methode, welche die Funktionalität ausführt.
	 * @param args
	 */
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	String input = scanner.nextLine();
    	System.out.println(input.toUpperCase());
    }
}
