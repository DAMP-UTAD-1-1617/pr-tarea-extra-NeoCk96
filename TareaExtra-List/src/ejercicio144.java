
public class ejercicio144 {

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ejercicio144 {

	static java.util.Scanner in;
	static BufferedReader br;

	public static boolean casoDePrueba() {
		if (!in.hasNext())
			return false;

		char[] asdf = null;
		asdf = in.nextLine().toCharArray();

		int count = 0;
		ArrayList<Character> qwer = new ArrayList<Character>();

		for (int i = 0; i < asdf.length; i++) {

			if (asdf[i] == '-') {
				count = 0;
			} else if (asdf[i] == '+') {
				count = qwer.size();
			} else if (asdf[i] == '*') {
				try {
					if ((qwer.get(count) >= 32 && qwer.get(count) <= 255)
							|| (qwer.get(count) >= 97 && qwer.get(count) <= 122)) {
						count++;
					}
				} catch (Exception e) {

				}
			} else if (asdf[i] == '3') {
				try {
					qwer.remove(count);
				} catch (Exception e) {

				}

			} else {
				qwer.add(count, asdf[i]);
				count++;
			}

		}
		for (int i = 0; i < qwer.size(); i++) {
			System.out.print(qwer.get(i));
		}
		System.out.println();
		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		br = new BufferedReader(new InputStreamReader(System.in));

		while (casoDePrueba())
			;
	}
}
