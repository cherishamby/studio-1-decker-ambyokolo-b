package studio1;

import java.util.Scanner;

public class Average {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("What is your number?");
	    int n1 = in.nextInt();
	System.out.print("What is your number?");
	    int n2 = in.nextInt();

    System.out.print("The average of " + n1 + " and " + n2 + " is " + (double) (n1+n2)/2);


}

}