package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("What is the value for x?");
		int x = in.nextInt();
		System.out.println("What is the value for y?");
		int y = in.nextInt();
		System.out.println("What is the value for z?");
		int z = in.nextInt();

		boolean isOrdered = x < y && y < z || x > y && y > z;
		System.out.print(isOrdered);
	}

}
