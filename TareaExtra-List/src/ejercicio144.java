import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio144 {

	static Scanner in;
	static BufferedReader br;

	public static boolean casoDePrueba() {
		if (!in.hasNext())
			return false;

		char[] letterArr = null;
		letterArr = in.nextLine().toCharArray();

		int count = 0;
		ArrayList<Character> letterList = new ArrayList<Character>();

		for (int i = 0; i < letterArr.length; i++) {

			if (letterArr[i] == '-') {
				count = 0;
			} else if (letterArr[i] == '+') {
				count = letterList.size();
			} else if (letterArr[i] == '*') {
				try {
					if ((letterList.get(count) >= 32 && letterList.get(count) <= 255)
							|| (letterList.get(count) >= 97 && letterList.get(count) <= 122)) {
						count++;
					}
				} catch (Exception e) {

				}

			} else if (letterArr[i] == '3') {
				try {
					letterList.remove(count);
				} catch (Exception e) {

				}

			} else {
				letterList.add(count, letterArr[i]);
				count++;
			}

		}

		for (int i = 0; i < letterList.size(); i++) {
			System.out.print(letterList.get(i));
		}

		System.out.println();
		return true;
	}

	public static void main(String args[]) {
		in = new Scanner(System.in);
		br = new BufferedReader(new InputStreamReader(System.in));

		while (casoDePrueba())
			;
	}
}