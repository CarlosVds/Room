package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rooms [] vect = new Rooms[10];
		
		System.out.print("How many rooms will be retend? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Rent# " + (i + 1));
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rooms(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

	}

}
